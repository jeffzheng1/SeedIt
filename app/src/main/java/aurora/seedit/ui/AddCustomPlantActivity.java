package aurora.seedit.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.parse.ParseObject;
import com.parse.ParseRelation;
import com.parse.ParseUser;

import java.util.List;

import aurora.seedit.R;
import aurora.seedit.utils.CurrentWeather;
import aurora.seedit.utils.ParseConstants;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class AddCustomPlantActivity extends ActionBarActivity
        implements DatePickerDialogFragment.DatepickerDialogListener,
        LocationDialogFragment.LocationDialogListener,
        GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener{

    protected ParseRelation mPlantsRelation;
    protected ParseUser mCurrentUser;
    protected java.util.Date mPlantDate;
    protected String mAddress;
    protected String mPlantName;

    private GoogleApiClient mGoogleApiClient;
    private Location mLastLocation;
    private double mLatitude;
    private double mLongitude;
    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;

    public static final String TAG = AddCustomPlantActivity.class.getSimpleName();

//    @InjectView(R.id.plant_info_text) TextView mPlantInfoText;
//    @InjectView(R.id.plant_time_text) TextView mPlantTimeText;
//    @InjectView(R.id.plant_location_text) TextView mPlantLocationText;
    @InjectView(R.id.plant_date_layout) RelativeLayout mPlantDateLayout;
    @InjectView(R.id.plant_location_layout) RelativeLayout mPlantLocationLayout;
    @InjectView(R.id.plant_name_field) EditText mPlantNameField;
    @InjectView(R.id.plant_date_field) TextView mPlantDateField;
//    @InjectView(R.id.plant_location_field) EditText mPlantLocationField;
    @InjectView(R.id.plant_location_field) TextView mPlantLocationField;
    @InjectView(R.id.add_plant_button) Button mAddPlantButton;
//    @InjectView(R.id.outdoor_radio_group) RadioGroup mOutdoorRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_custom_plant);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.inject(this);
        buildGoogleApiClient();

        Intent intent = getIntent();
        mPlantName = intent.getStringExtra("plant_name");
        if (!mPlantName.equals("NULL")) {
            mPlantNameField.setText(mPlantName);
        }
        applyFont();
        mAddPlantButton.setTransformationMethod(null);

        mPlantLocationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                DialogFragment locationDialogFragment = new LocationDialogFragment();
                locationDialogFragment.setArguments(args);
                locationDialogFragment.show(getSupportFragmentManager(), "location");
            }
        });

        mPlantDateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                DialogFragment datePickerFragment = new DatePickerDialogFragment();
                datePickerFragment.setArguments(args);
                datePickerFragment.show(getSupportFragmentManager(), "datepicker");
            }
        });

        mAddPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseObject plantProfile = createPlantProfile();
//                save(plantProfile);
                finish();
            }
        });
    }

    private void applyFont() {
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Lato-Regular.ttf");
        mPlantNameField.setTypeface(type);
        mPlantDateField.setTypeface(type);
        mAddPlantButton.setTypeface(type);
        mPlantLocationField.setTypeface(type);
    }

    protected ParseObject createPlantProfile() {
        String location = getLocation();
        String plantName = mPlantNameField.getText().toString();
        mCurrentUser = ParseUser.getCurrentUser();
        mPlantsRelation = mCurrentUser.getRelation(ParseConstants.KEY_PLANTS_RELATION);
        ParseObject plantProfile = new ParseObject(ParseConstants.CLASS_PLANTS);
        plantProfile.put(ParseConstants.KEY_PLANT_NAME, plantName);
        plantProfile.put(ParseConstants.KEY_PLANTED_AT, mPlantDate);
        plantProfile.put(ParseConstants.KEY_PLANT_LOCATION, location);
        plantProfile.put("planter", mCurrentUser.getUsername());
        plantProfile.saveInBackground();
        return plantProfile;
    }

    private String getLocation() {
        if (mAddress.equals("currentLocation")) {
            return Double.toString(mLatitude) + "," + Double.toString(mLongitude);
        } else if (mAddress.equals("gardenLocation")) {
            //TODO: make parse entry to garden location
            return "";
        } else {
            LatLng latLng = getLocationFromAddress(mAddress);
            return Double.toString(latLng.latitude) + "," +  Double.toString(latLng.longitude);
        }
    }

//    protected void save(ParseObject plantProfile) {
//        mPlantsRelation.add(plantProfile);
//        mCurrentUser.saveInBackground();
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_custom_plant, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up health_icon, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog, java.util.Date date) {
        mPlantDate = date;
        mPlantDateField.setText(dateParser(date.toString()));
//        Log.v(TAG, date.toString());
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog, String address) {
        mAddress = address;
        if (mAddress.equals("currentLocation")) {
            mPlantLocationField.setText("Current Location");
        } else if (mAddress.equals("gardenLocation")) {
            mPlantLocationField.setText("Garden Location");
        } else {
            mPlantLocationField.setText(address);
        }
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
    }

    public String dateParser(String date) {
        String delims = "[ ]+";
        String[] tokens = date.split(delims);
        return tokens[0] + " " + tokens[1] + " " + tokens[2];
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            mLatitude = mLastLocation.getLatitude();
            mLongitude = mLastLocation.getLongitude();
        }
    }

    @Override
    public void onConnectionSuspended(int i) {
        mGoogleApiClient.connect();
    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        Log.i(TAG, "Connection failed: ConnectionResult.getErrorCode() = " + result.getErrorCode());
    }

    public LatLng getLocationFromAddress(String strAddress) {

        Geocoder coder = new Geocoder(this);
        List<Address> address;
        LatLng p1 = null;

        try {
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            location.getLatitude();
            location.getLongitude();

            p1 = new LatLng(location.getLatitude(), location.getLongitude());

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return p1;
    }
}
