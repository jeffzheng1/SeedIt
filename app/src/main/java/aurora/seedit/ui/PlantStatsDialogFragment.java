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
import aurora.seedit.utils.CircleDisplay;

public class PlantStatsDialogFragment extends DialogFragment {

    private String mPlantName;

    public PlantStatsDialogFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        mPlantName = getArguments().getString("plant_name");

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_plant_stats, null);
        builder.setView(v);

        Typeface type1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Medium.ttf");
        TextView title = (TextView) v.findViewById(R.id.stats_title);
        title.setText(mPlantName);
        title.setTypeface(type2);
        TextView soil_moist = (TextView) v.findViewById(R.id.soil_moisture_title);
        TextView soil_nutri = (TextView) v.findViewById(R.id.soil_nutri_title);
        TextView temp = (TextView) v.findViewById(R.id.temp_title);
        TextView sunlight = (TextView) v.findViewById(R.id.sunlight_title);
        soil_moist.setTypeface(type1);
        soil_nutri.setTypeface(type1);
        temp.setTypeface(type1);
        sunlight.setTypeface(type1);

        CircleDisplay cd1 = (CircleDisplay) v.findViewById(R.id.circleDisplay1);
        cd1.setColor(getResources().getColor(R.color.polymer_blue_dark));
        cd1.setValueWidthPercent(10);
        cd1.setTouchEnabled(false);
        cd1.showValue(50, 100, false);

        CircleDisplay cd2 = (CircleDisplay) v.findViewById(R.id.circleDisplay2);
        cd2.setColor(getResources().getColor(R.color.material_orange));
        cd2.setValueWidthPercent(10);
        cd2.setUnit("°F");
        cd2.setFormatDigits(0);
        cd2.setTouchEnabled(false);
        cd2.showValue(75, 100, false);

        CircleDisplay cd3 = (CircleDisplay) v.findViewById(R.id.circleDisplay3);
        cd3.setColor(getResources().getColor(R.color.seedit_green));
        cd3.setValueWidthPercent(10);
        cd3.setFormatDigits(0);
        cd3.setTouchEnabled(false);
        cd3.showValue(75, 100, false);

        CircleDisplay cd4 = (CircleDisplay) v.findViewById(R.id.circleDisplay4);
        cd4.setColor(getResources().getColor(R.color.polymer_red_dark));
        cd4.setValueWidthPercent(10);
        cd4.setFormatDigits(0);
        cd4.setTouchEnabled(false);
        cd4.showValue(50, 100, false);

        // Create the AlertDialog object and return it
        return builder.create();
    }
}
