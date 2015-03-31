package aurora.seedit.adapters;

import java.util.Date;
import java.util.List;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.parse.ParseObject;
import aurora.seedit.utils.ParseConstants;
import aurora.seedit.R;

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

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.garden_item, null);
            holder = new ViewHolder();
//            holder.iconImageView = (ImageView)convertView.findViewById(R.id.messageIcon);
            holder.nameLabel = (TextView) convertView.findViewById(R.id.plant_name_garden_item);
            holder.timeLabel = (TextView) convertView.findViewById(R.id.days_till_harvest_number);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        ParseObject plant = mPlants.get(position);


        //Needs to change to be updated to plant time
//        Date createdAt = plant.getCreatedAt();
//        long now = new Date().getTime();
//        String convertedDate = DateUtils.getRelativeTimeSpanString(
//                createdAt.getTime(), now, DateUtils.SECOND_IN_MILLIS).toString();
        holder.timeLabel.setText("20");

//        if (message.getString(ParseConstants.KEY_FILE_TYPE).equals(ParseConstants.TYPE_IMAGE)) {
//            holder.iconImageView.setImageResource(R.drawable.ic_picture);
//        }
//        else {
//            holder.iconImageView.setImageResource(R.drawable.ic_video);
//        }
        holder.nameLabel.setText(plant.getString(ParseConstants.KEY_PLANT_NAME));

        return convertView;
    }

    private static class ViewHolder {
        //teamtreehouse variables
        ImageView iconImageView;
        TextView nameLabel;
        TextView timeLabel;

        ImageView plantImage;
        TextView harvestCounter;
        TextView waterCounter;
        TextView plantName;
        Button waterButton;
        ProgressBar harvestProgress;

    }

    public void refill(List<ParseObject> messages) {
        mPlants.clear();
        mPlants.addAll(messages);
        notifyDataSetChanged();
    }
}






