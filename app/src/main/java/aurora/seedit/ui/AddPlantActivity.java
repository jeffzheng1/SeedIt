package aurora.seedit.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.parse.ParseRelation;
import com.parse.ParseUser;

import aurora.seedit.R;
import aurora.seedit.utils.ParseConstants;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class AddPlantActivity extends ActionBarActivity {

    protected ParseRelation mPlantsRelation;
    protected ParseUser mCurrentUser;
    @InjectView(R.id.seedit_plant_button) ImageButton mSeeditPlantButton;
    @InjectView(R.id.custom_plant_button) ImageButton mCustomPlantButton;
    @InjectView(R.id.recent_plant_button) ImageButton mRecentPlantButton;
    @InjectView(R.id.seedit_plant_text) TextView mSeeditPlantText;
    @InjectView(R.id.custom_plant_text) TextView mCustomPlantText;
    @InjectView(R.id.recent_plant_text) TextView mRecentPlantText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_plant);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.inject(this);

        applyFont();
        mCustomPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPlantActivity.this, AddCustomPlantActivity.class);
                startActivity(intent);
            }
        });
//        mCurrentUser = ParseUser.getCurrentUser();
//        mCurrentUser.getRelation(ParseConstants.KEY_PLANTS_RELATION);
//        mCurrentUser.saveInBackground();
    }

    private void applyFont() {
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Lato-Light.ttf");
        mSeeditPlantText.setTypeface(type);
        mCustomPlantText.setTypeface(type);
        mRecentPlantText.setTypeface(type);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_plant, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up water_button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
