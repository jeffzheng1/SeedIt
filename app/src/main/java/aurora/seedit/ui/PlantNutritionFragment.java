package aurora.seedit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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

import aurora.seedit.R;
import aurora.seedit.utils.CircleDisplay;
import aurora.seedit.utils.SeeditPlantFunctions;

public class PlantNutritionFragment extends DialogFragment {

    private String mPlantName;

    public PlantNutritionFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        mPlantName = getArguments().getString("plant_name");

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_plant_nutrition, null);
        builder.setView(v);

        ImageView label = (ImageView) v.findViewById(R.id.nutrition_label);
        label.setBackgroundResource(SeeditPlantFunctions.plantToNutri(mPlantName));

        // Create the AlertDialog object and return it
        return builder.create();
    }
}