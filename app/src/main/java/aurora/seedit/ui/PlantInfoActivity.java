package aurora.seedit.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import aurora.seedit.R;
import aurora.seedit.utils.SeeditPlantFunctions;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class PlantInfoActivity extends ActionBarActivity {

//    @InjectView(R.id.plant_info_name) TextView mPlantInfoName;
    @InjectView(R.id.plant_info_prof_pic) ImageView mPlantInfoProfPic;
    @InjectView(R.id.store_button) ImageView mStoreButton;

    private String mPlantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.inject(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mPlantName = extras.getString("plant_name");
//            mPlantInfoName.setText(plantName);
            mPlantInfoProfPic.setBackgroundResource(SeeditPlantFunctions.plantToImage(mPlantName));
        }

        mStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(PlantInfoActivity.this, StoreActivity.class);
//                intent.putExtra("plant_name", mPlantName);
//                startActivity(intent);
                Uri uri = Uri.parse(SeeditPlantFunctions.plantToURL(mPlantName));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
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
