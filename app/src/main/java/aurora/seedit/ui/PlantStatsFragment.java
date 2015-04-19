package aurora.seedit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import aurora.seedit.R;
import aurora.seedit.utils.CircleDisplay;

public class PlantStatsFragment extends DialogFragment {

    private String mPlantName;

    public PlantStatsFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        mPlantName = getArguments().getString("plant_name");

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_plant_stats, null);
        builder.setView(v);

        TextView title = (TextView) v.findViewById(R.id.stats_title);
        title.setText(mPlantName);

        CircleDisplay cd1 = (CircleDisplay) v.findViewById(R.id.circleDisplay1);
        cd1.setColor(getResources().getColor(R.color.polymer_blue_dark));
        cd1.setValueWidthPercent(5);
        cd1.showValue(50, 100, false);

        CircleDisplay cd2 = (CircleDisplay) v.findViewById(R.id.circleDisplay2);
        cd2.setColor(getResources().getColor(R.color.material_orange));
        cd2.setValueWidthPercent(5);
        cd2.setUnit("°F");
        cd2.setFormatDigits(0);
        cd2.showValue(75, 100, false);

        // Create the AlertDialog object and return it
        return builder.create();
    }
}
