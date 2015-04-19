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

    static public String plantToURL(String plant) {
        String plantURL;
        switch (plant) {
            case "Basil":
                plantURL = "herbs/basil/";
                break;
            case "Blueberries":
                plantURL = "fruit-plants/blueberry-plants/";
                break;
            case "Cantaloupes":
                plantURL = "fruit-plants/melon/cantaloupe/";
                break;
            case "Cherry Tomatoes":
                plantURL = "vegetables/tomatoes/cherry/";
                break;
            case "Cilantro":
                plantURL = "herbs/cilantro/";
                break;
            case "Corn":
                plantURL = "vegetables/corn/";
                break;
            case "Cucumbers":
                plantURL = "vegetables/cucumbers/";
                break;
            case "Eggplants":
                plantURL = "vegetables/eggplants/";
                break;
            case "Kale":
                plantURL = "vegetables/kale";
                break;
            case "Leaf Lettuce":
                plantURL = "vegetables/lettuce/looseleaf/";
                break;
            case "Lemon":
                plantURL = "";
                break;
            case "Peppers":
                plantURL = "vegetables/peppers/all-peppers/";
                break;
            case "Radish":
                plantURL = "vegetables/radish/";
                break;
            case "Sage":
                plantURL = "herbs/sage/";
                break;
            case "Slicing Tomatoes":
                plantURL = "tomatoes/beefsteak/";
                break;
            case "Snow Peas":
                plantURL = "vegetables/peas/snow-sugar/";
                break;
            case "Strawberries":
                plantURL = "fruit-plants/strawberry-plants/";
                break;
            case "Swiss Chard":
                plantURL = "vegetables/swiss-chard/";
                break;
            case "Watermelon":
                plantURL = "fruit-plants/melon/watermelon/";
                break;
            case "Zucchini":
                plantURL = "vegetables/squash/summer/zucchini/";
                break;
            default:
                plantURL = "";
        }
        return "http://www.burpee.com/" + plantURL;
    }
}
