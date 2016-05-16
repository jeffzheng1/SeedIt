package aurora.seedit.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.parse.ParseRelation;
import com.parse.ParseUser;

import aurora.seedit.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class AddPlantActivity extends ActionBarActivity {

    protected ParseRelation mPlantsRelation;
    protected ParseUser mCurrentUser;
    @InjectView(R.id.seedit_plant_button) Button mSeeditPlantButton;
    @InjectView(R.id.custom_plant_button) Button mCustomPlantButton;
    @InjectView(R.id.recent_plant_button) Button mRecentPlantButton;

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
                intent.putExtra("plant_name", "NULL");
                startActivity(intent);
            }
        });

        mSeeditPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPlantActivity.this, AddSeeditPlantActivity.class);
                startActivity(intent);
            }
        });
    }

    private void applyFont() {
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Lato-Medium.ttf");
        mSeeditPlantButton.setTypeface(type);
        mCustomPlantButton.setTypeface(type);
        mRecentPlantButton.setTypeface(type);

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
