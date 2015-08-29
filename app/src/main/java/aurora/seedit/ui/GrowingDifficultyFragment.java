package aurora.seedit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import aurora.seedit.R;
import aurora.seedit.utils.CircleDisplay;
import aurora.seedit.utils.SeeditPlantFunctions;

public class GrowingDifficultyFragment extends DialogFragment {

    private String mPlantName;

    public GrowingDifficultyFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        mPlantName = getArguments().getString("plant_name");

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_growing_difficulty, null);
        builder.setView(v);

        String[] growingDiffInfo = SeeditPlantFunctions.plantToDifficulty(mPlantName);

        TextView title = (TextView) v.findViewById(R.id.seasonality_title);
        TextView diffTitle = (TextView) v.findViewById(R.id.growing_diff_title);
        TextView waterTitle = (TextView) v.findViewById(R.id.watering_freq_title);
        TextView maturityTitle = (TextView) v.findViewById(R.id.maturity_title);

        TextView diffAmount = (TextView) v.findViewById(R.id.overall_diff_amount);
        diffAmount.setText(growingDiffInfo[0]);

        TextView waterAmount = (TextView) v.findViewById(R.id.watering_freq_amount);
        waterAmount.setText(growingDiffInfo[1]);

        TextView maturityAmount = (TextView) v.findViewById(R.id.maturity_amount);
        maturityAmount.setText(growingDiffInfo[2]);

        Typeface type1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Light.ttf");
        Typeface type3 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Medium.ttf");
        title.setTypeface(type2);
        diffTitle.setTypeface(type3);
        waterTitle.setTypeface(type3);
        maturityTitle.setTypeface(type3);
        diffAmount.setTypeface(type1);
        waterAmount.setTypeface(type1);
        maturityAmount.setTypeface(type1);

        // Create the AlertDialog object and return it
        return builder.create();
    }

}