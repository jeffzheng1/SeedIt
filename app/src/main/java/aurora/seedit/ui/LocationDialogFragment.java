package aurora.seedit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import aurora.seedit.R;

public class LocationDialogFragment extends DialogFragment implements AdapterView.OnItemSelectedListener {

    private String mState;
    LocationDialogListener mListener;
    private String mLocationStatus;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mState = (String) parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        mState = (String) parent.getItemAtPosition(0);
    }

    public interface LocationDialogListener {
        void onDialogPositiveClick(DialogFragment dialog, String address);
        void onDialogNegativeClick(DialogFragment dialog);
    }

    String[] states = {"AK","AL","AR","AZ","CA","CO","CT","DC","DE","FL","GA","GU","HI","IA",
            "ID", "IL","IN","KS","KY","LA","MA","MD","ME","MH","MI","MN","MO","MS","MT","NC","ND",
            "NE","NH","NJ","NM","NV","NY", "OH","OK","OR","PA","PR","PW","RI","SC","SD","TN","TX",
            "UT","VA","VI","VT","WA","WI","WV","WY"};

    public LocationDialogFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_location_dialog, null);
        builder.setView(v);

        final Button currentLocationButton = (Button) v.findViewById(R.id.current_location_button);
        final Button gardenLocationButton = (Button) v.findViewById(R.id.garden_location_button);
        final EditText addressEditText1 = (EditText) v.findViewById(R.id.address_edittext1);
        final EditText addressEditText2 = (EditText) v.findViewById(R.id.address_edittext2);
        final Spinner stateSpinner = (Spinner) v.findViewById(R.id.spinner);
        stateSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.states_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(adapter);

        currentLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentLocationButton.setBackgroundColor(getResources().getColor(R.color.nliveo_white));
                currentLocationButton.setTextColor(getResources().getColor(R.color.nliveo_green_colorPrimary));
                gardenLocationButton.setBackgroundColor(getResources().getColor(R.color.nliveo_green_colorPrimary));
                gardenLocationButton.setTextColor(getResources().getColor(R.color.nliveo_white));
                mLocationStatus = "currentLocation";
            }
        });

        gardenLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentLocationButton.setBackgroundColor(getResources().getColor(R.color.nliveo_green_colorPrimary));
                currentLocationButton.setTextColor(getResources().getColor(R.color.nliveo_white));
                gardenLocationButton.setBackgroundColor(getResources().getColor(R.color.nliveo_white));
                gardenLocationButton.setTextColor(getResources().getColor(R.color.nliveo_green_colorPrimary));
                mLocationStatus = "gardenLocation";
            }
        });

        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                    // User clicked OK, so save the mSelectedItems results somewhere
                    // or return them to the component that opened the dialog
                        if (!addressEditText1.getText().toString().equals("")) {
                            final String formattedAddress = getFormattedAddress(addressEditText1.getText().toString(),
                                    addressEditText2.getText().toString(), mState);
                            mListener.onDialogPositiveClick(LocationDialogFragment.this,
                                    formattedAddress);
                        } else {
                            mListener.onDialogPositiveClick(LocationDialogFragment.this,
                                    mLocationStatus);
                        }
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        mListener.onDialogNegativeClick(LocationDialogFragment.this);
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

    private String getFormattedAddress(String street, String city, String state) {
        return street + "," + city + "," + state;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the NoticeDialogListener so we can send events to the host
            mListener = (LocationDialogListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement LocationDialogListener");
        }
    }
}
