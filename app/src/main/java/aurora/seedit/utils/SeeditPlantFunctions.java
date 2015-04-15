package aurora.seedit.utils;

import aurora.seedit.R;

/**
 * Created by JeffZheng on 3/31/15.
 */
public class SeeditPlantFunctions {

    public String seedit_green = "#498D5B";
    public String seedit_purple = "#673AB7";

    public String plantToColor(String plant) {
        //maybe another function
        switch (plant) {

            case "Eggplant":
                return seedit_purple;
            case "Cucumber":
                return seedit_green;
            case "Orange":

            default:
                return seedit_green;
        }
    }

    static public int plantToImage(String plant) {
        switch (plant) {
            case "Basil":
                return R.drawable.basil;
            case "Blueberries":
                return R.drawable.blueberries;
            case "Cantaloupes":
                return R.drawable.cantalopes;
            case "Cherry Tomatoes":
                return R.drawable.cherry_tomatoes;
            case "Cilantro":
                return R.drawable.cilantro;
            case "Corn":
                return R.drawable.corn;
            case "Cucumbers":
                return R.drawable.cucumbers;
            case "Eggplants":
                return R.drawable.eggplants;
            case "Kale":
                return R.drawable.kale;
            case "Leaf Lettuce":
                return R.drawable.leaf_lettuce;
            case "Lemon":
                return R.drawable.lemon;
            case "Peppers":
                return R.drawable.peppers;
            case "Radish":
                return R.drawable.radish;
            case "Sage":
                return R.drawable.sage;
            case "Slicing Tomatoes":
                return R.drawable.slicing_tomatoes;
            case "Snow Peas":
                return R.drawable.snow_peas;
            case "Strawberries":
                return R.drawable.strawberries;
            case "Swiss Chard":
                return R.drawable.swiss_chard;
            case "Watermelon":
                return R.drawable.watermelon;
            case "Zucchini":
                return R.drawable.zucchini;
            default:
                return 0;
        }
    }
}
