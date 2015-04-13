package aurora.seedit.utils;

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

}
