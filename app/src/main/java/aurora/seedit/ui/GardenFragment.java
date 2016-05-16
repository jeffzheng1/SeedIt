package aurora.seedit.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseRelation;
import com.parse.ParseUser;

import java.util.List;

import aurora.seedit.R;
import aurora.seedit.adapters.GardenListAdapter;
import aurora.seedit.utils.ParseConstants;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A placeholder fragment containing a simple view.
 */
public class GardenFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private List<ParseObject> mPlants;
    protected ParseRelation mPlantsRelation;
    protected ParseUser mCurrentUser;
    @InjectView(R.id.empty_garden_message) TextView mEmptyGardenMessage;
    @InjectView(R.id.garden_list) ListView mGardenList;

    public String TAG = "GardenFragment.java";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GardenFragment newInstance(int sectionNumber) {
        GardenFragment fragment = new GardenFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GardenFragment() {
    }

    @Override
    public void onResume() {
        super.onResume();
        mEmptyGardenMessage.setVisibility(View.INVISIBLE);

        mCurrentUser = ParseUser.getCurrentUser();
        if (mCurrentUser != null) {
            ParseQuery<ParseObject> query = ParseQuery.getQuery("plants");
            query.whereEqualTo("planter", mCurrentUser.getUsername());
            query.addDescendingOrder(ParseConstants.KEY_PLANTED_AT);
            query.findInBackground(new FindCallback<ParseObject>() {
                @Override
                public void done(List<ParseObject> plants, ParseException e) {
                    if (e == null) {
                        mPlants = plants;
                        if (mPlants.size() == 0) {
                            mEmptyGardenMessage.setVisibility(View.VISIBLE);
                        }
                        if (mGardenList.getAdapter() == null) {
                            GardenListAdapter adapter = new GardenListAdapter(
                                    mGardenList.getContext(),
                                    mPlants);
                            mGardenList.setAdapter(adapter);
                        }
                        else {
                            // refill the adapter!
                            ((GardenListAdapter) mGardenList.getAdapter()).refill(mPlants);
                        }
                    }
                }
            });
        } else {
            mEmptyGardenMessage.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_garden, container, false);
        ButterKnife.inject(this, rootView);

        return rootView;
    }

    private void applyFont() {
        Typeface type = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Light.ttf");
        mEmptyGardenMessage.setTypeface(type);
//        mEmptyGardenMessage.setTypeface(type);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
}