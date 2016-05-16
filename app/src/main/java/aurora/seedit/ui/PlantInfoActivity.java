package aurora.seedit.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import aurora.seedit.R;
import aurora.seedit.utils.SeeditPlantFunctions;
import butterknife.ButterKnife;
import butterknife.InjectView;
import de.hdodenhof.circleimageview.CircleImageView;

public class PlantInfoActivity extends ActionBarActivity {

    @InjectView(R.id.plant_info_name) TextView mPlantInfoName;
    @InjectView(R.id.plant_info_count) TextView mPlantInfoCount;
    @InjectView(R.id.plant_info_difficulty) TextView mPlantInfoDifficulty;
    @InjectView(R.id.plant_info_season) TextView mPlantInfoSeason;
    @InjectView(R.id.plant_info_prof_pic) CircleImageView mPlantInfoProfPic;
    @InjectView(R.id.nutrition_button) ImageView mNutritionButton;
    @InjectView(R.id.difficulty_button) ImageView mGrowingDiffButton;
    @InjectView(R.id.instructions_button) ImageView mInstructionsButton;
    @InjectView(R.id.seasonality_button) ImageView mSeasonalityButton;
    @InjectView(R.id.store_button) ImageView mStoreButton;
    @InjectView(R.id.wiki_button) ImageView mWikiButton;
    @InjectView(R.id.nutrition_title) TextView mNutritionTitle;
    @InjectView(R.id.difficulty_title) TextView mGrowingDiffTitle;
    @InjectView(R.id.instructions_title) TextView mInstructionsTitle;
    @InjectView(R.id.seasonality_title) TextView mSeasonalityTitle;
    @InjectView(R.id.store_title) TextView mStoreTitle;
    @InjectView(R.id.wiki_title) TextView mWikiTitle;

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
            mPlantInfoName.setText(mPlantName);
            int resourceId = SeeditPlantFunctions.plantToImage(mPlantName);
            mPlantInfoProfPic.setImageResource(resourceId);
            mPlantInfoProfPic.setBorderWidth(3);
            mPlantInfoProfPic.setBorderColor(getResources().getColor(R.color.seedit_green));
        }

        applyFont();

        final Bundle args = new Bundle();
        args.putString("plant_name", mPlantName);

        mNutritionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment plantNutritionFragment = new PlantNutritionFragment();
                plantNutritionFragment.setArguments(args);
                plantNutritionFragment.show(getSupportFragmentManager(), "nutrition");
            }
        });

        mGrowingDiffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment growingDifficultyFragment = new GrowingDifficultyFragment();
                growingDifficultyFragment.setArguments(args);
                growingDifficultyFragment.show(getSupportFragmentManager(), "growing diff");
            }
        });

        mInstructionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment growingInstructionFragment = new GrowingInstructionFragment();
                growingInstructionFragment.setArguments(args);
                growingInstructionFragment.show(getSupportFragmentManager(), "instructions");
            }
        });

        mSeasonalityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment plantSeasonalityFragment = new PlantSeasonalityFragment();
                plantSeasonalityFragment.setArguments(args);
                plantSeasonalityFragment.show(getSupportFragmentManager(), "seasonality");
            }
        });


        mStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(SeeditPlantFunctions.plantToStoreURL(mPlantName));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        mWikiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(SeeditPlantFunctions.plantToWikiURL(mPlantName));
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

    private void applyFont() {
        Typeface type1 = Typeface.createFromAsset(getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(getAssets(), "fonts/Lato-Medium.ttf");
        mNutritionTitle.setTypeface(type1);
        mGrowingDiffTitle.setTypeface(type1);
        mInstructionsTitle.setTypeface(type1);
        mSeasonalityTitle.setTypeface(type1);
        mStoreTitle.setTypeface(type1);
        mWikiTitle.setTypeface(type1);
        mPlantInfoName.setTypeface(type2);
        mPlantInfoCount.setTypeface(type1);
        mPlantInfoDifficulty.setTypeface(type1);
        mPlantInfoSeason.setTypeface(type1);

    }
}
