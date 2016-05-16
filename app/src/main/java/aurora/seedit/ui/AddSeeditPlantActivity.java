package aurora.seedit.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.List;

import aurora.seedit.R;
import aurora.seedit.adapters.SeeditPlantsListAdapter;
import aurora.seedit.utils.SeeditPlantFunctions;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class AddSeeditPlantActivity extends ActionBarActivity {

    private List<String> mPlants;
    @InjectView(R.id.seedit_plants_list) ListView mPlantsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_seedit_plant);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.inject(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPlants = SeeditPlantFunctions.getAllPlants();
        if (mPlantsList.getAdapter() == null) {
            SeeditPlantsListAdapter adapter = new SeeditPlantsListAdapter(
                    mPlantsList.getContext(),
                    mPlants);
            mPlantsList.setAdapter(adapter);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seedit_plant, menu);
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
