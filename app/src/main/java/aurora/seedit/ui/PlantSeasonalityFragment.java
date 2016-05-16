package aurora.seedit.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import aurora.seedit.R;
import aurora.seedit.utils.SeeditPlantFunctions;

public class PlantSeasonalityFragment extends DialogFragment {

    private String mPlantName;

    public PlantSeasonalityFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        mPlantName = getArguments().getString("plant_name");

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_plant_seasonality, null);
        builder.setView(v);

        String[] seasonalityInfo = SeeditPlantFunctions.plantToSeasonality(mPlantName);

        TextView title = (TextView) v.findViewById(R.id.seasonality_title);
        TextView siteTitle = (TextView) v.findViewById(R.id.site_cond_title);
        TextView soilTempTitle = (TextView) v.findViewById(R.id.soil_temp_title);
        TextView sunlightTitle = (TextView) v.findViewById(R.id.sunlight_title);

        TextView siteAmount = (TextView) v.findViewById(R.id.site_amount);
        siteAmount.setText(seasonalityInfo[0]);

        TextView soilTempAmount = (TextView) v.findViewById(R.id.soil_temp_amount);
        soilTempAmount.setText(seasonalityInfo[1]);

        TextView sunlightAmount = (TextView) v.findViewById(R.id.sunlight_amount);
        sunlightAmount.setText(seasonalityInfo[2]);

        Typeface type1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Light.ttf");
        Typeface type3 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Medium.ttf");
        title.setTypeface(type2);
        siteTitle.setTypeface(type3);
        soilTempTitle.setTypeface(type3);
        sunlightTitle.setTypeface(type3);
        siteAmount.setTypeface(type1);
        soilTempAmount.setTypeface(type1);
        sunlightAmount.setTypeface(type1);

        // Create the AlertDialog object and return it
        return builder.create();
    }
}