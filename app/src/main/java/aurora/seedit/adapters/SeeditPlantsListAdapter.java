package aurora.seedit.adapters;

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
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.parse.ParseObject;

import aurora.seedit.ui.AddCustomPlantActivity;
import aurora.seedit.ui.PlantStatsDialogFragment;
import aurora.seedit.ui.PlantInfoActivity;
import aurora.seedit.utils.ParseConstants;
import aurora.seedit.utils.SeeditPlantFunctions;
import aurora.seedit.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class SeeditPlantsListAdapter extends ArrayAdapter<String> {

    protected Context mContext;
    protected List<String> mPlants;

    public SeeditPlantsListAdapter(Context context, List<String> plants) {
        super(context, R.layout.seedit_plant_item, plants);
        mContext = context;
        mPlants = plants;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.seedit_plant_item, null);
            holder = new ViewHolder();
            holder.iconImageView = (CircleImageView) convertView.findViewById(R.id.plant_icon);
            holder.nameLabel = (TextView) convertView.findViewById(R.id.plant_name_garden_item);
            holder.plantInfoButton = (Button) convertView.findViewById(R.id.seedit_info_button);
            holder.addButton = (Button) convertView.findViewById(R.id.add_button);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        final String plantName = mPlants.get(position);

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

        holder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, AddCustomPlantActivity.class);
                intent.putExtra("plant_name", plantName);
                mContext.startActivity(intent);
            }
        });

        holder.plantInfoButton.setTransformationMethod(null);
        Typeface type1 = Typeface.createFromAsset(mContext.getAssets(), "fonts/Lato-Regular.ttf");
        Typeface type2 = Typeface.createFromAsset(mContext.getAssets(), "fonts/Lato-Medium.ttf");
        holder.plantInfoButton.setTypeface(type1);
        holder.nameLabel.setTypeface(type2);

        return convertView;
    }

    private static class ViewHolder {
        CircleImageView iconImageView;
        TextView nameLabel;
        Button plantInfoButton;
        Button addButton;
    }

}