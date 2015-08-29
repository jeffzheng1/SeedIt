package aurora.seedit.adapters;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.parse.ParseObject;

import aurora.seedit.ui.PlantStatsDialogFragment;
import aurora.seedit.ui.PlantInfoActivity;
import aurora.seedit.utils.ParseConstants;
import aurora.seedit.utils.SeeditPlantFunctions;
import aurora.seedit.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class GardenListAdapter extends ArrayAdapter<ParseObject> {

    protected Context mContext;
    protected List<ParseObject> mPlants;

    public GardenListAdapter(Context context, List<ParseObject> plants) {
        super(context, R.layout.garden_item, plants);
        mContext = context;
        mPlants = plants;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        //Link up listview row layout with viewholder attributes
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.garden_item, null);
            holder = new ViewHolder();
            holder.iconImageView = (CircleImageView) convertView.findViewById(R.id.plant_icon);
            holder.nameLabel = (TextView) convertView.findViewById(R.id.plant_name_garden_item);
            holder.timeLabel = (TextView) convertView.findViewById(R.id.days_till_harvest_number);
            holder.plantInfoButton = (Button) convertView.findViewById(R.id.seedit_info_button);
            holder.healthButton = (Button) convertView.findViewById(R.id.health_icon);
            holder.deleteButton = (Button) convertView.findViewById(R.id.delete_button);
            holder.harvestTitle = (TextView) convertView.findViewById(R.id.days_till_harvest_title);
            holder.harvestProgress = (ProgressBar) convertView.findViewById(R.id.progressBar);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        ParseObject plant = mPlants.get(position);
        //Get the basic information for a plant
        final String plantName = plant.getString(ParseConstants.KEY_PLANT_NAME);
        final Date plantDate = plant.getDate(ParseConstants.KEY_PLANTED_AT);
        long secondsStart = plantDate.getTime();
        Calendar c = Calendar.getInstance();
        long secondsEnd = c.getTimeInMillis();

        //Get the days left for a plant harvest
        int daysElapsed = (int)  ((secondsEnd - secondsStart) / (1000*60*60*24));
        String[] plantTimeInfo = SeeditPlantFunctions.plantToDifficulty(plantName);
        int daysLeft =  Integer.parseInt(plantTimeInfo[2].substring(0, 2)) - daysElapsed;
        if (daysLeft < 0) {
            daysLeft = 0;
        }
        holder.timeLabel.setText(Integer.toString(daysLeft));

        holder.harvestProgress.setProgress(daysLeft/Integer.parseInt(plantTimeInfo[2].substring(0, 2)));

        holder.healthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                args.putString("plant_name", plantName);
                DialogFragment plantStatsFragment = new PlantStatsDialogFragment();
                plantStatsFragment.setArguments(args);
                plantStatsFragment.show(((FragmentActivity) mContext).getSupportFragmentManager(), "stats");
            }
        });

        //Set title (the plant name) for each list item
        holder.nameLabel.setText(plantName);

        //Set picture for plant info activity
        holder.iconImageView.setImageDrawable(mContext.getResources().getDrawable(SeeditPlantFunctions.plantToImage(plantName)));
        holder.plantInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PlantInfoActivity.class);
                intent.putExtra("plant_name", plantName);
                mContext.startActivity(intent);
            }
        });

        holder.plantInfoButton.setTransformationMethod(null);
        holder.deleteButton.setTransformationMethod(null);
        Typeface type1 = Typeface.createFromAsset(mContext.getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(mContext.getAssets(), "fonts/Lato-Medium.ttf");
        holder.plantInfoButton.setTypeface(type1);
        holder.deleteButton.setTypeface(type1);
        holder.timeLabel.setTypeface(type1);
        holder.harvestTitle.setTypeface(type1);
        holder.nameLabel.setTypeface(type2);
        holder.healthButton.setTypeface(type1);

        return convertView;
    }

    private static class ViewHolder {
        CircleImageView iconImageView;
        TextView nameLabel;
        TextView timeLabel;
        Button plantInfoButton;
        Button deleteButton;
        Button healthButton;
        TextView harvestTitle;
        ProgressBar harvestProgress;
    }

    public void refill(List<ParseObject> messages) {
        mPlants.clear();
        mPlants.addAll(messages);
        notifyDataSetChanged();
    }
}