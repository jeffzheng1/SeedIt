package aurora.seedit.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.parse.ParseObject;

import java.util.List;

import aurora.seedit.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public void onResume() {
        super.onResume();

//        getActivity().setProgressBarIndeterminateVisibility(true);
//
//        ParseQuery<ParseObject> query = new ParseQuery<ParseObject>(ParseConstants.CLASS_PLANTS);
//        query.whereEqualTo(ParseConstants.KEY_RECIPIENT_IDS, ParseUser.getCurrentUser().getObjectId());
//        query.addDescendingOrder(ParseConstants.KEY_CREATED_AT);
//        query.findInBackground(new FindCallback<ParseObject>() {
//            @Override
//            public void done(List<ParseObject> plants, ParseException e) {
//                getActivity().setProgressBarIndeterminateVisibility(false);
//
//                if (e == null) {
//                    // We found messages!
//                    mPlants = plants;
//
//                    String[] usernames = new String[mPlants.size()];
//                    int i = 0;
//                    for(ParseObject plant : mPlants) {
//                        usernames[i] = plant.getString(ParseConstants.KEY_SENDER_NAME);
//                        i++;
//                    }
//                    if (mGardenList.getAdapter() == null) {
//                        GardenListAdapter adapter = new GardenListAdapter(
//                                mGardenList.getContext(),
//                                mPlants);
//                        mGardenList.setAdapter(adapter);
//                    }
//                    else {
//                        // refill the adapter!
//                        ((GardenListAdapter) mGardenList.getAdapter()).refill(mPlants);
//                    }
//                }
//            }
//        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_placeholder, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
}