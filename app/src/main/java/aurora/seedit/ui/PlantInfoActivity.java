package aurora.seedit.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import aurora.seedit.R;
import aurora.seedit.utils.SeeditPlantFunctions;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class PlantInfoActivity extends ActionBarActivity {

//    @InjectView(R.id.plant_info_name) TextView mPlantInfoName;
    @InjectView(R.id.plant_info_prof_pic) ImageView mPlantInfoProfPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.inject(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String plantName = extras.getString("plant_name");
//            mPlantInfoName.setText(plantName);
            mPlantInfoProfPic.setBackgroundResource(SeeditPlantFunctions.plantToImage(plantName));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_plant_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
