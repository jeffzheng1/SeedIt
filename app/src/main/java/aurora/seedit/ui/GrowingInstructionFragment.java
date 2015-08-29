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

import aurora.seedit.R;
import aurora.seedit.utils.CircleDisplay;
import aurora.seedit.utils.SeeditPlantFunctions;

public class GrowingInstructionFragment extends DialogFragment {

    private String mPlantName;

    public GrowingInstructionFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        mPlantName = getArguments().getString("plant_name");

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_growing_instruction, null);
        builder.setView(v);

        String growingInstructions = SeeditPlantFunctions.plantToInstructions(mPlantName);

        TextView title = (TextView) v.findViewById(R.id.growing_instructions_title);

        TextView diffAmount = (TextView) v.findViewById(R.id.growing_instructions_text);
        diffAmount.setText(growingInstructions);

        Typeface type1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Light.ttf");
//        Typeface type3 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lato-Medium.ttf");
        title.setTypeface(type2);
        diffAmount.setTypeface(type1);

        // Create the AlertDialog object and return it
        return builder.create();
    }
}