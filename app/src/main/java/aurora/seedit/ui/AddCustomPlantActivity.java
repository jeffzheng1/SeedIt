package aurora.seedit.ui;

import android.app.AlertDialog;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseClassName;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseRelation;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import aurora.seedit.R;
import aurora.seedit.utils.ParseConstants;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class AddCustomPlantActivity extends ActionBarActivity {

    protected ParseRelation mPlantsRelation;
    protected ParseUser mCurrentUser;

    public static final String TAG = AddCustomPlantActivity.class.getSimpleName();


    @InjectView(R.id.plant_info_text) TextView mPlantInfoText;
    @InjectView(R.id.plant_time_text) TextView mPlantTimeText;
    @InjectView(R.id.plant_location_text) TextView mPlantLocationText;
    @InjectView(R.id.plant_name_field) EditText mPlantNameField;
    @InjectView(R.id.plant_date_field) EditText mPlantDateField;
    @InjectView(R.id.plant_location_field) EditText mPlantLocationField;
    @InjectView(R.id.plant_outdoor_info) TextView mPlantOutdoorInfo;
    @InjectView(R.id.add_plant_button) Button mAddPlantButton;
    @InjectView(R.id.outdoor_radio_group) RadioGroup mOutdoorRadioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_custom_plant);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.inject(this);
//        applyFont();

        mAddPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseObject plantProfile = createPlantProfile();
                save(plantProfile);
                finish();
            }
        });

    }

    private void applyFont() {
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Lato-Light.ttf");
        mPlantOutdoorInfo.setTypeface(type);
        mPlantInfoText.setTypeface(type);
        mPlantTimeText.setTypeface(type);
        mPlantLocationText.setTypeface(type);
        mPlantNameField.setTypeface(type);
        mPlantDateField.setTypeface(type);
        mPlantLocationField.setTypeface(type);
        mAddPlantButton.setTypeface(type);
    }

    protected ParseObject createPlantProfile() {
        mCurrentUser = ParseUser.getCurrentUser();
        mPlantsRelation = mCurrentUser.getRelation(ParseConstants.KEY_PLANTS_RELATION);
        ParseObject plantProfile = new ParseObject(ParseConstants.CLASS_PLANTS);
        plantProfile.put(ParseConstants.KEY_PLANT_NAME, mPlantNameField.getText().toString());
        plantProfile.put(ParseConstants.KEY_PLANTED_AT, mPlantDateField.getText().toString());
        plantProfile.put(ParseConstants.KEY_PLANT_LOCATION, mPlantLocationField.getText().toString());
        plantProfile.put(ParseConstants.KEY_PLANT_OUTDOORS, mOutdoorRadioGroup.getCheckedRadioButtonId());
        plantProfile.saveInBackground();
        return plantProfile;
    }

    protected void save(ParseObject plantProfile) {
        mPlantsRelation.add(plantProfile);
//        mCurrentUser.saveInBackground();

    }

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
}
