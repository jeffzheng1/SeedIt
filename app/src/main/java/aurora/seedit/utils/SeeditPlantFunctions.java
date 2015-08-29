package aurora.seedit.utils;

import java.util.Arrays;
import java.util.List;

import aurora.seedit.R;

/**
 * Created by JeffZheng on 3/31/15.
 */
public class SeeditPlantFunctions {

    static public List<String> getAllPlants() {
        List<String> plants = Arrays.asList("Spinach",
                "Broccoli",
                "Potatoes",
                "Cauliflower",
                "Onions",
                "Arugula",
                "Celery",
                "Cantaloupes",
                "Corn",
                "Cucumbers",
                "Eggplants",
                "Kale",
                "Leaf Lettuce",
                "Peppers",
                "Radish",
                "Tomatoes",
                "Snow Peas",
                "Swiss Chard",
                "Watermelon",
                "Zucchini");
        return plants;
    }

    static public int plantToImage(String plant) {
        switch (plant) {
            case "Spinach":
                return R.drawable.spinach;
            case "Broccoli":
                return R.drawable.broccoli;
            case "Potatoes":
                return R.drawable.potatoes;
            case "Cauliflower":
                return R.drawable.cauliflower;
            case "Onions":
                return R.drawable.onions;
            case "Arugula":
                return R.drawable.arugula;
            case "Celery":
                return R.drawable.celery;
            case "Cantaloupes":
                return R.drawable.cantalopes;
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
            case "Peppers":
                return R.drawable.peppers;
            case "Radish":
                return R.drawable.radish;
            case "Tomatoes":
                return R.drawable.slicing_tomatoes;
            case "Snow Peas":
                return R.drawable.snow_peas;
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

    static public String plantToStoreURL(String plant) {
        String plantURL;
        switch (plant) {
            case "Spinach":
                plantURL = "vegetables/spinach";
                break;
            case "Broccoli":
                plantURL = "vegatables/broccoli";
                break;
            case "Potatoes":
                plantURL = "vegetables/potatoes";
                break;
            case "Cauliflower":
                plantURL = "vegetables/cauliflower";
                break;
            case "Onions":
                plantURL = "vegetables/onions";
                break;
            case "Arugula":
                plantURL = "vegetables/argula";
                break;
            case "Celery":
                plantURL = "vegetables/celery";
                break;
            case "Cantaloupes":
                plantURL = "fruit-plants/melon/cantaloupe/";
                break;
            case "Corn":
                plantURL = "vegetables/corn/";
                break;
            case "Cucumbers":
                plantURL = "vegetables/cucumbers/burpless";
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
            case "Peppers":
                plantURL = "vegetables/peppers/all-peppers/";
                break;
            case "Radish":
                plantURL = "vegetables/radish/";
                break;
            case "Tomatoes":
                plantURL = "tomatoes/beefsteak/";
                break;
            case "Snow Peas":
                plantURL = "vegetables/peas/snow-sugar/";
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

    public static String plantToWikiURL(String plant) {
        String plantURL;
        switch (plant) {
            case "Spinach":
                plantURL = "spinach";
                break;
            case "Broccoli":
                plantURL = "broccoli";
                break;
            case "Potatoes":
                plantURL = "potatoes";
                break;
            case "Cauliflower":
                plantURL = "cauliflower";
                break;
            case "Onions":
                plantURL = "onion";
                break;
            case "Arugula":
                plantURL = "arugula";
                break;
            case "Celery":
                plantURL = "celery";
                break;
            case "Cantaloupes":
                plantURL = "cantaloupe";
                break;
            case "Corn":
                plantURL = "corn";
                break;
            case "Cucumbers":
                plantURL = "cucumber";
                break;
            case "Eggplants":
                plantURL = "eggplant";
                break;
            case "Kale":
                plantURL = "kale";
                break;
            case "Leaf Lettuce":
                plantURL = "lettuce";
                break;
            case "Peppers":
                plantURL = "chili_pepper";
                break;
            case "Radish":
                plantURL = "radish";
                break;
            case "Tomatoes":
                plantURL = "tomato";
                break;
            case "Snow Peas":
                plantURL = "snow_pea";
                break;
            case "Swiss Chard":
                plantURL = "chard";
                break;
            case "Watermelon":
                plantURL = "watermelon";
                break;
            case "Zucchini":
                plantURL = "zucchini";
                break;
            default:
                plantURL = "plants";
        }
        return "http://www.wikipedia.org/wiki/" + plantURL;
    }

    public static int plantToNutri(String plant) {
        switch (plant) {
            case "Spinach":
                return R.drawable.nutri_cantaloupe;
            case "Broccoli":
                return R.drawable.nutri_cantaloupe;
            case "Potatoes":
                return R.drawable.nutri_cantaloupe;
            case "Cauliflower":
                return R.drawable.nutri_cantaloupe;
            case "Onions":
                return R.drawable.nutri_cantaloupe;
            case "Arugula":
                return R.drawable.nutri_cantaloupe;
            case "Celery":
                return R.drawable.nutri_cantaloupe;
            case "Cantaloupes":
                return R.drawable.nutri_cantaloupe;
            case "Cilantro":
                return R.drawable.nutri_cilantro;
            case "Corn":
                return R.drawable.nutri_corn;
            case "Cucumbers":
                return R.drawable.nutri_cucumber;
            case "Eggplants":
                return R.drawable.nutri_eggplant;
            case "Kale":
                return R.drawable.nutri_kale;
            case "Leaf Lettuce":
                return R.drawable.nutri_lettuce;
            case "Peppers":
                return R.drawable.nutri_pepper;
            case "Radish":
                return R.drawable.nutri_radish;
            case "Tomatoes":
                return R.drawable.nutri_tomato;
            case "Snow Peas":
                return R.drawable.nutri_snow_pea;
            case "Swiss Chard":
                return R.drawable.nutri_swiss_chard;
            case "Watermelon":
                return R.drawable.nutri_watermelon;
            case "Zucchini":
                return R.drawable.nutri_zucchini;
            default:
                return 1;
        }
    }

    static public String[] plantToDifficulty(String plant) {
        String[] difficulty = new String[3];
        switch (plant) {
            case "Spinach":
                difficulty[0] = "Medium";
                difficulty[1] = "Water everyday to light moisture.";
                difficulty[2] = "30 - 45 days";
                return difficulty;
            case "Broccoli":
                difficulty[0] = "Medium";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "55 - 70 days";
                return difficulty;
            case "Potatoes":
                difficulty[0] = "Easy";
                difficulty[1] = "Water heavily once a week. Limit to 2 inches of water per week.";
                difficulty[2] = "80 - 90 days";
                return difficulty;
            case "Cauliflower":
                difficulty[0] = "Difficult";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "55 - 70 days";
                return difficulty;
            case "Onions":
                difficulty[0] = "Medium";
                difficulty[1] = "Water moderately once a week. Make sure water penetrates deep into soil.";
                difficulty[2] = "80 - 90 days";
                return difficulty;
            case "Arugula":
                difficulty[0] = "Easy";
                difficulty[1] = "Water every 2 days to medium moisture.";
                difficulty[2] = "30 - 40 days";
                return difficulty;
            case "Celery":
                difficulty[0] = "Difficult";
                difficulty[1] = "Water everyday to full moisture.";
                difficulty[2] = "95 - 110 days";
                return difficulty;
            case "Cantaloupes":
                difficulty[0] = "Medium";
                difficulty[1] = "Water heavily twice a week. Limit to 2 inches of water per week.";
                difficulty[2] = "70 - 80 days";
                return difficulty;
            case "Corn":
                difficulty[0] = "Medium";
                difficulty[1] = "Water moderately twice a week. Limit to 1.5 inches of water per week.";
                difficulty[2] = "60 - 75 days";
                return difficulty;
            case "Cucumbers":
                difficulty[0] = "Easy";
                difficulty[1] = "Water moderately twice a week. Limit to 1.5 inches of water per week.";
                difficulty[2] = "45 - 60 days";
                return difficulty;
            case "Eggplants":
                difficulty[0] = "Medium";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "55 - 70 days";
                return difficulty;
            case "Kale":
                difficulty[0] = "Easy";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "50 - 65 days";
                return difficulty;
            case "Leaf Lettuce":
                difficulty[0] = "Easy";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "40 - 50 days";
                return difficulty;
            case "Peppers":
                difficulty[0] = "Medium";
                difficulty[1] = "Water every 2 days. Limit to 1 inch of water per week.";
                difficulty[2] = "70 - 85 days";
                return difficulty;
            case "Radish":
                difficulty[0] = "Easy";
                difficulty[1] = "Water lightly everyday. Limit to 1 inch of water per week. ";
                difficulty[2] = "20 - 30 days";
                return difficulty;
            case "Tomatoes":
                difficulty[0] = "Medium";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "70 - 80 days";
                return difficulty;
            case "Snow Peas":
                difficulty[0] = "Easy";
                difficulty[1] = "Water twice a  week. Limit to 1 inch of water per week.";
                difficulty[2] = "60 - 70 days";
                return difficulty;
            case "Swiss Chard":
                difficulty[0] = "Easy";
                difficulty[1] = "Water every 2 days. Limit to 1.5 inches of water per week.";
                difficulty[2] = "50 - 60 days";
                return difficulty;
            case "Watermelon":
                difficulty[0] = "Medium";
                difficulty[1] = "Water moderately once a week. Make sure water penetrates deep into soil.";
                difficulty[2] = "80 - 90 days";
                return difficulty;
            case "Zucchini":
                difficulty[0] = "Easy";
                difficulty[1] = "Water twice a week. Limit to 1.5 inches of water per week.";
                difficulty[2] = "40 - 55 days";
                return difficulty;
            default:
                return difficulty;
        }
    }

    static public String[] plantToSeasonality(String plant) {
        String[] difficulty = new String[3];
        switch (plant) {
            case "Spinach":
                difficulty[0] = "Well-drained, fertile soil, high in organic matter. Plentiful, consistent moisture. Tolerates slightly alkaline soils but is sensitive to acid soils. pH should be at least 6.0, but preferably in the 6.5 to 7.5 range.";
                difficulty[1] = "40 F to 75 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Broccoli":
                difficulty[0] = "Prefers well-drained, fertile soil high in organic matter, pH 6.0 to 7.5.";
                difficulty[1] = "45 F to 85 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Potatoes":
                difficulty[0] = "Prefers well-drained, light, deep, loose soil, high in organic matter. Unlike most vegetables, potatoes perform best in acid soil with pH 4.8 - 5.5. ";
                difficulty[1] = "40 F to 50 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Cauliflower":
                difficulty[0] = "Prefers well-drained, fertile soil high in organic matter, pH 6.0 to 7.5. Can tolerate slightly alkaline soil. ";
                difficulty[1] = "45 F to 85 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Onions":
                difficulty[0] = "Well-drained, rich soil, high in organic matter, neutral pH. Optimum pH is 6.2 to 6.8. Requires plentiful, even moisture for good yields.";
                difficulty[1] = "45 F to 95 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Arugula":
                difficulty[0] = "Prefers rich humusy soil with pH of 6 to 6.8, but will tolerate wide variety of conditions. Evenly moist soil will help slow bolting.";
                difficulty[1] = "40 F to 55 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Celery":
                difficulty[0] = "Prefers rich soil, high in organic matter with pH 6.0 to 7.0 and consistent, plentiful supply of moisture. Can tolerate soils that are less than well-drained because it was originally a wetland plant.";
                difficulty[1] = "70 F to 75 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Cantaloupes":
                difficulty[0] = "Prefers warm, well-drained, soil, high in organic matter with pH 6.5 to 7.5. Consistent, plentiful moisture needed until fruit is about the size of a tennis ball.";
                difficulty[1] = "60 F to 95 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Corn":
                difficulty[0] = "Needs deep, well-drained, fertile soil, pH 6.0 to 6.8 and consistent, plentiful moisture.";
                difficulty[1] = "65 F to 85 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Cucumbers":
                difficulty[0] = "Well-drained, fertile soil, high in organic matter with near-neutral pH. Consistent, plentiful moisture needed until fruit is ripening.";
                difficulty[1] = "60 F to 90 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Eggplants":
                difficulty[0] = "Prefers fertile, well-drained, slightly acid soil that is high in organic matter for best growth and yield, but tolerates a broader range of soil types.";
                difficulty[1] = "60 F to 95 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Kale":
                difficulty[0] = "Prefers well-drained, fertile soil high in organic matter, pH 6.0 to 7.5. Can tolerate slightly alkaline soil. Prefers plentiful, consistent moisture. Can tolerate drought, but quality and flavor of leaves suffer.";
                difficulty[1] = "45 F to 85 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Leaf Lettuce":
                difficulty[0] = "Tolerant of a wide range of soils, but prefers well-drained, cool, loose soil with plentiful moisture and pH 6.2 to 6.8. Sensitive to low pH. Lime to at least 6.0.";
                difficulty[1] = "40 F to 85 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Peppers":
                difficulty[0] = "Well-drained, light, moderately fertile soil, high in organic matter. Needs steady supply of water for best performance.";
                difficulty[1] = "70 F to 95 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Radish":
                difficulty[0] = "Prefers well-drained, loose soil, high in organic matter, free from stones, with pH 5.8 to 6.8. Needs plentiful, consistent moisture.";
                difficulty[1] = "55 F to 85 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Tomatoes":
                difficulty[0] = "Prefers well-drained, fertile soil, high in organic matter. Clays and loams produce the highest yields. But lighter soils that drain and warm quickly can produce earlier harvests -- particularly if they are on a slight slope to the south or southeast. Can tolerate slightly acid soils, as low as pH 5.5. ";
                difficulty[1] = "60 F to 95 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Snow Peas":
                difficulty[0] = "Prefers well-drained soil, average fertility, high in organic matter with pH 6.0 to 7.0. Widely adapted, but prefers cool, damp weather. Good soil structure is important. ";
                difficulty[1] = "40 F to 85 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Swiss Chard":
                difficulty[0] = "Prefers deep, loose, fertile soil, high in organic matter, with pH 6.0 to 7.0. Needs consistent moisture, especially as plants grow large.";
                difficulty[1] = "40 F to 95 F";
                difficulty[2] = "Full Sun / Part Shade";
                return difficulty;
            case "Watermelon":
                difficulty[0] = "Prefers warm, well-drained, soil, high in organic matter with pH 6.5 to 7.5. Consistent, plentiful moisture needed until fruit is about the size of a tennis ball. ";
                difficulty[1] = "60 F to 95 F";
                difficulty[2] = "Full Sun";
                return difficulty;
            case "Zucchini":
                difficulty[0] = "Prefers well-drained, fertile, loose soil, high in organic matter with pH between 5.8 and 6.8. Plentiful and consistent moisture is needed from the time plants emerge until fruits begin to fill out.";
                difficulty[1] = "60 F to 105 F ";
                difficulty[2] = "Full Sun";
                return difficulty;
            default:
                return difficulty;
        }
    }

    public static String plantToInstructions(String plant) {
        switch (plant) {
            case "Spinach":
                return "As soon as you can work the soil in spring, sow seed ½ inch deep, 1 inch apart in rows 12 to 18 inches apart (or broadcast seed across a wider area). Thin to 2- to 6-inch spacings. Closer spacings can stress plants and cause them to go to seed (bolt) sooner.\n \n" +
                        "Early planting is critical as dry soil, heat and lengthening days also encourage bolting. Later plantings benefit from some light shade from other crops. Follow early plantings with warm-season crops such as tomatoes or beans.\n" +
                        "\n" +
                        "Make succession plantings every week or two until average last frost date. Use bolt-resistant varieties for later plantings. Sow again in mid- to late summer for fall harvest. Seeds do not germinate well in warm soil, so increase seeding rate to compensate. Or pre-germinate seeds by placing them between sheets of moist paper towel in a plastic bag and refrigerating until they sprout.\n" +
                        "\n" +
                        "Spinach seedlings are difficult to transplant. For spring crops, start inside only if your garden stays too wet in spring to allow direct seeding. Start transplants inside about 3 to 6 weeks before last frost.\n" +
                        "\n" +
                        "Spinach is shallow-rooted and requires consistent moisture to prevent bolting. Water to keep soil moist. Mulch after plants are well established to maintain moisture and suppress weeks. Use floating row covers to prevent insect damage.\n" +
                        "\n" +
                        "Do not overfertilize with nitrogen. Only apply supplemental fertilizer if leaves are pale green. Add lime to make sure pH is at least 6.0. You should suspect that your soil is too acid if germination is poor and leaf tips and margins are yellow or brown.\n" +
                        "\n" +
                        "Plant in fall and mulch heavily for early spring crop.";
            case "Broccoli":
                return "Sow seeds indoors 6 to 8 weeks before average last spring frost. Keep soil warm (about 75 F), until germination. Then keep plants around 60 F. Provide direct sun so plants don’t get leggy. When plants are 4 to 6 weeks old, transplant into garden 12 to 20 inches apart.\n \n" +
                        "Use wide spacings if you want to harvest large central heads. Closer spacings will produce smaller central heads. But if you harvest secondary heads you will get a greater total yield from the closer spacings.\n" +
                        "\n" +
                        "Larger, older transplants are more likely to bolt when exposed to cool temperatures in the garden. Transplant when plants have four or five true leaves.\n" +
                        "\n" +
                        "Some cultivars will form small “button” heads when the weather turns warm following a 10-day stretch when high temperatures only reach the 40s F.\n" +
                        "\n" +
                        "Can be direct-seeded as soon as you can work the soil. Will germinate at soil temps as low as 40 F. Plant ½ to ¾ inch deep, about 3 inches apart. Thin to final spacings.\n" +
                        "\n" +
                        "Direct seed in midsummer for fall crop, or start transplants in late May and transplant in late June or early July.\n" +
                        "\n" +
                        "In Zone 7 and warmer, fall broccoli crops will often overwinter.\n" +
                        "\n" +
                        "Use low nitrogen fertilizer at planting. Too much nitrogen fertilizer may cause hollow stems.\n" +
                        "\n" +
                        "Plants have shallow root systems. Avoid even shallow cultivation. Mulch to protect roots, reduce weed competition and conserve moisture.\n" +
                        "\n" +
                        "Use floating row covers to help protect from early insect infestations.\n" +
                        "\n" +
                        "To help reduce disease, do not plant broccoli or other cole crops in the same location more than once every three or four years.";
            case "Potatoes":
                return "Potatoes perform best in areas where summers are cool (65 F to 70 F), but are widely adapted.\n \n" +
                        "Potatoes require well-drained soil. (They will rot under prolonged cold, wet conditions.) If your soil is poorly drained or a heavy clay, consider using raised beds. Adding organic matter (compost, cover crops, well-rotted manure or leaves) is a good way to improve soil before growing potatoes. Go easy on organic matter sources high in nitrogen (such as manure) and nitrogen fertilizer as too much nitrogen can encourage lush foliage at the expense of tuber production.\n" +
                        "\n" +
                        "Unlike most vegetables, potatoes perform best in acid soil with pH 4.8 - 5.5. Use scab-resistant varieties with pH above 6.0. Because most other garden vegetables perform best at near-neutral pH, it’s usually not feasible to grow potatoes in their preferred pH range, unless you dedicate one section of your garden to growing just potatoes in rotation with cover crops.\n" +
                        "\n" +
                        "Buy certified disease-free seed potatoes from garden centers or through online or mail-order catalogs for best results. If you save your own seed potatoes, discard any that show any signs of disease. Avoid planting potatoes from the supermarket because they may have been treated with sprout inhibitors. They may also be less vigorous and more prone to disease.\n" +
                        "\n" +
                        "Cut seed potatoes that are larger than a chicken egg into pieces about 1 inch across or slightly larger. Each piece should have at least one “eye” (the bud where the stem will grow from) -- preferably two eyes. Egg-sized and smaller tubers can be planted whole.\n" +
                        "\n" +
                        "Traditionally, cut seed potato pieces are allowed to cure for a few days to a few weeks before planting. This is because the cut potatoes need high humidity, plenty of oxygen and temperatures between 50 F and 65 F to heal quickly. If you have excellent, well-drained soil that meets those conditions, you can plant the seed pieces without curing. But if conditions are not right, the seed potatoes will rot in the ground.\n" +
                        "\n" +
                        "A less risky practice is to put about 5 pounds of cut potatoes into a large grocery bag and fold the top closed. Keep the bag at room temperature for 2 or 3 days, then shake the bag to unstick pieces that may have stuck together. Let sit for another 2 to 3 days and then plant.\n" +
                        "\n" +
                        "If you want fast emergence, keep the bag of cut potatoes at room temperature until sprouts appear. Some varieties are slow to break dormancy and benefit from a 2- to 4-week “pre-warming” before planting. Others sprout in just a few days.\n" +
                        "\n" +
                        "Plant about 2 to 4 weeks before your last frost date. The soil temperature should be at least 40 F. Do not plant where you've grown potatoes, tomatoes, peppers or eggplant in the past 2 years.\n" +
                        "\n" +
                        "One common way to plant potatoes is to dig a shallow trench about 4 inches deep with a hoe. Place the seed potato pieces with their eyes up (cut sides down) about 8 to 12 inches apart in the trench, and replace soil. Space trenches about 2 to 3 feet apart. Stems and foliage should emerge in about 2 to 4 weeks, depending on soil temperature.\n" +
                        "\n" +
                        "When the plants are about 6 to 8 inches tall, “hill” the potatoes by hoeing soil loosely around the base of the plants to within about an inch of the lower leaves from both sides of the row. Repeat in about 2 to 3 weeks. You may want to make additional hillings, gradually building a 6- to 8-inch ridge down the row. (Hilling keeps the developing potatoes from being exposed to sun, which turns them green and bitter. Green potatoes contain a chemical, solanine, which is toxic in large amounts.)\n" +
                        "\n" +
                        "Alternatively, snuggle seed pieces shallowly into the soil and cover with a thick layer of clean straw or other weed-free mulch. Add more mulch as needed to keep light from reaching potatoes. (A foot or more of mulch may be required.) Tubers grown this way can be easily harvested by pulling back the mulch after the plants die.\n" +
                        "\n" +
                        "A third method if you have excellent potato-growing soil is to plant seed potatoes 7 to 8 inches deep and skip hilling or deep mulching. The potatoes are slower to emerge, but this method requires less effort during the growing season. Deep planting is not good in cold, damp soils and it requires more work to dig the potatoes at harvest.\n" +
                        "\n" +
                        "Potatoes need at least 1 inch of water per week from either rainfall or deep watering. Mulching helps retain moisture. Keeping the soil from drying out also helps reduce scab.\n" +
                        "\n" +
                        "Use row covers to protect from Colorado potato beetles, leaf hoppers and flea beetles. Crush the yellow eggs of Colorado potato beetles on the undersides of leaves. Remove adults by hand.";
            case "Cauliflower":
                return "Most finicky of the cole (cabbage family) crops. Heads will not develop properly in hot or dry weather, so timing is crucial. Will tolerate cold as well as other cole crops in spring, but mature heads are not resistant to hard freezes.\n \n" +
                        "Sow seeds indoors 4 to 6 weeks before average last spring frost. Keep soil warm (about 75 F), until germination. Then keep plants around 60 F. Provide direct sun so plants don’t get leggy. When plants are 4 to 6 weeks old, transplant into garden 15 to 24 inches apart in rows 24 to 36 inches apart. Wait until soil temperature is 50 F or above and danger of frost is past before transplanting.\n" +
                        "\n" +
                        "Larger, older transplants are more likely to bolt when exposed to cool temperatures in the garden. Transplant when plants have four or five true leaves.\n" +
                        "\n" +
                        "Some cultivars will form small “button” heads when the weather turns warm following a 10-day stretch when high temperatures only reach the 40s F.\n" +
                        "\n" +
                        "Direct seeding is more difficult than with other cole crops, especially in spring. For fall crops, plant seed in late-spring early summer ½ to ¾ inch deep, about 3 inches apart. Thin to final spacings. Or start transplants in late May and transplant in late June or early July.\n" +
                        "\n" +
                        "Plants have shallow root systems. Avoid even shallow cultivation. Mulch to protect roots, reduce weed competition and conserve moisture.\n" +
                        "\n" +
                        "To preserve the white color of the curd, use string or rubber bands to secure outside leaves over the head when it is about 2 to 3 inches in diameter. From tying to harvest may take less than a week in summer or as long as a month in fall.\n" +
                        "\n" +
                        "Too much sun, heat or nitrogen fertilizer can cause “ricey” heads where the curd separates into small, rice-like grains.";
            case "Onions":
                return "Can be direct-seeded, grown from transplants started inside, or from sets -- small bulbs about ½-inch in diameter grown from seed the previous season.\n \n" +
                        "Choose a weed-free, well-drained location. Raised beds are ideal. Onions are good for intercropping with other garden plants, especially early-maturing spring greens. Do not plant where other onion family crops have been grown in the past 3 years.\n" +
                        "\n" +
                        "Direct-seeding in the garden may not allow enough time for long-season varieties to mature, but is fine for shorter-season varieties or for scallions - onions harvested before the bulb forms.\n" +
                        "\n" +
                        "Direct-seed in spring when the soil reaches 50 F. Plant seed ¼ inch deep, ½ inch apart, in rows 12 to 18 inches apart. Thin to 4-inch spacings for large bulbs, 2-inch spacings for smaller bulbs but higher yields, or 1-inch spacings for scallions.\n" +
                        "\n" +
                        "Start transplants inside about 8 to 10 weeks before last frost date. Plant 4 or 5 seeds in each cell, or seed in flats ¼ inch deep and ½ inch apart. If tops grow too tall and begin to droop, trim back to about 3 inches tall with scissors. After hardening off, transplant 2 to 4 weeks before last frost date. Space 4 inches apart for large bulbs, 2 inches apart for smaller bulbs, or 1 inch apart for scallions.\n" +
                        "\n" +
                        "From sets:   Choose bulbs no larger than ¾ inch in diameter. Large bulbs are more prone to bolting. Plant sets about 1 inch deep 2 to 4 weeks before last frost date. Space 4 inches apart for large bulbs or 2 inches apart for smaller bulbs.\n" +
                        "\n" +
                        "Onions have shallow root systems and need consistent moisture and good weed control. Water weekly if weather is dry, and mulch to retain moisture and suppress weeds.";
            case "Arugula":
                return "Seeds germinate quickly even in cold soil. Plant as soon as soil can be worked in spring.\n \n" +
                        "Avoid planting after other cabbage family crops.\n" +
                        "\n" +
                        "Plant ¼ inch deep and 1 inch apart in rows, or broadcast alone or mixed with other greens. Gradually thin to 6-inch spacings using thinnings for salads.\n" +
                        "\n" +
                        "Make new plantings every 2 to 3 weeks for a continuous supply until about a month before your average first frost date.\n" +
                        "\n" +
                        "Slow bolting by reducing heat and moisture stress. Provide some shade for warm-season plantings.\n" +
                        "\n" +
                        "Fast-growing plants are good for intercropping and relay cropping.\n" +
                        "\n" +
                        "Often self-seeds. Is self-sterile and requires insects for pollination. Will not cross with other members of the mustard family.";
            case "Celery":
                return "Start plants inside about 10 to 12 weeks before last frost. Plant several seeds per cell. Seeds need light to germinate, so don’t cover seed deeply. Keep soil moist and warm (about 70 F to 75 F) until seeds germinate in 2 to 3 weeks. After germination, grow inside in a cool location (about 60 F to 70 F). Thin to one seed per cell.\n \n" +
                        "Plants will withstand light frost, but 10 days with night temperatures below 40 and days below 55 F can cause bolting. So harden plants by reducing water, not lowering temperature.\n" +
                        "\n" +
                        "Set out transplants 6 to 12 inches apart, rows 18 to 36 inches apart, about 2 weeks before average last frost.\n" +
                        "\n" +
                        "Plants are shallow-rooted and require consistent moisture. Lack of water will make stalks fibrous and bitter. Mulch to retain moisture, suppress weeds and avoid disturbing roots when cultivating.\n" +
                        "\n" +
                        "For a milder flavor, blanch by wrapping stalks two weeks before harvest with paper, a cardboard milk carton or other material.";
            case "Cantaloupes":
                return "If you have long, hot growing seasons direct-seed into garden. To ensure ripening in areas with shorter growing seasons and cooler weather, choose fast-maturing varieties, start plants inside, use black or IRT plastic mulch to warm soil and use fabric row covers to protect plants.\n \n" +
                        "Direct-seed 1 to 2 weeks after average last frost when soil is 70 F or warmer. Plant ½ inch deep, 6 seeds per hill, hills 4 to 6 feet apart; or 1 foot apart in rows 5 feet apart. Can plant at closer spacings if trellised. Thin to 2 to 3 plants per hill.\n" +
                        "\n" +
                        "For transplanting, sow seeds indoors ¼ inch deep in peat pots (2-inch square or bigger), 2 to 4 weeks before setting out. Plants should have one or two true leaves when transplanted.\n" +
                        "\n" +
                        "Transplant at same spacings as direct-seeded crops - 2 to 3 plants per hill in hills spaced 4 to 6 feet apart, or 1 to 2 feet apart in rows 5 feet apart. Transplants are delicate and roots are sensitive to disturbance. If you need to thin, use scissors. Keep soil intact around plant when transplanting.\n" +
                        "\n" +
                        "Mulch plants after soil has warmed to help maintain consistent moisture and suppress weeds.\n" +
                        "\n" +
                        "If using fabric row covers, remove at flowering to allow pollination by bees. Good pollination is critical to fruit set.\n" +
                        "\n" +
                        "Plants require consistent moisture until pollination. Once fruits are about the size of a tennis ball, only water if soil is dry and leaves show signs of wilting.\n" +
                        "\n" +
                        "To prevent insect damage to developing fruits, place melons on pots or pieces of wood.\n" +
                        "\n" +
                        "If growing melons on a trellis, support fruit with slings made from netting, fabric, or pantyhose. Trellising improves air circulation around plants and can help reduce foliar disease problems. Choose small-fruited varieties and reduce plant spacing.\n" +
                        "\n" +
                        "For large plantings, leave a strip of rye cover crop every second or third row perpendicular to prevailing winds to protect plants from damaging wind.\n" +
                        "\n" +
                        "To reduce insect and disease problems, avoid planting cucumber family crops (melons, squash, pumpkins) in the same spot two years in a row.";
            case "Corn":
                return "Corn requires rich, fertile soil. Add compost or well rotted manure in fall. Consider planting a legume cover crop the season before corn to help meet the nutrient needs of this heavy feeder.\n \n" +
                        "Make first planting after last frost date. Soil should be at least 65 F for fast germination. (Corn will not germinate if soil temperature is less than 55 F.) To speed increase in soil temperature, consider covering soil with black plastic for several weeks before planting.\n" +
                        "\n" +
                        "Plant in blocks of at least 4 rows of a single hybrid (as opposed to fewer, longer rows) for good pollination and well-filled ears. (Some corn varieties need to be isolated from others. See variety information below.)\n" +
                        "\n" +
                        "Plant seeds 1 inch deep and 4 to 6 inches apart in rows 30 to 36 inches apart. Thin to 8- to 12-inch spacings when plants are 3 to 4 inches tall. Increase seeding rates to ensure a good stand if soils are cold or you are using seed that has not been treated with fungicide. (Untreated seed has natural color. Treated seed is dyed.)\n" +
                        "\n" +
                        "For a sequential harvest, make first planting using an early hybrid. Two weeks later, plant another block of an early hybrid, plus blocks of mid- and late-season hybrids. Continue making plantings until late June, depending on the length of your growing season.\n" +
                        "\n" +
                        "To save space, you can intercrop corn with early-harvested cool-season crops.\n" +
                        "\n" +
                        "Corn plants have many roots close to the surface, so cultivate around them with care. You can hill soil up around the base of plants as they grow to bury small weeds in the row and give the corn a better foothold. After the soil has warmed, you can mulch corn to help suppress weeds and retain moisture.\n" +
                        "\n" +
                        "It is not necessary to remove suckers (side sprouts growing from the base of the plant). Studies show that removing them may actually reduce yields.\n" +
                        "\n" +
                        "Corn is a heavy feeder - particularly of nitrogen - and may require several sidedressings of fertilizer for best yields. Look for signs of nutrient deficiency. Purple-tinged leaves are a sign of phosphorus deficiency. Pale green leaves are a sign of nitrogen deficiency.\n" +
                        "\n" +
                        "For miniature or baby corn, plant seeds 2 to 4 inches apart and harvest as silks emerge from the ear, or harvest secondary ears from normally spaced plantings, allowing the main ear to fully mature. Also try hybrids specifically bred for early baby corn harvest.";
            case "Cucumbers":
                return "Cucumbers are very sensitive to cold. They need warm soil and air, whether direct-seeded or transplanted. Don’t rush to plant too early. Seed will not germinate if soil temperature is below 50 F, and germinates only slowly at 68 F.\n \n" +
                        "Direct-seed 1 to 1 ½ inches deep, either in rows (2 inches apart in rows 5 to 6 feet apart) or in hills (3 to 6 seeds per hill, hills spaced 3 to 5 feet apart).\n" +
                        "\n" +
                        "Thin to 8 to 15 inches apart in rows or 2 to 3 plants per hill. Snip off plants when thinning to avoid disturbing the roots of nearby plants.\n" +
                        "\n" +
                        "For early crops, use black plastic mulch and row covers or other protection to speed warming and protect plants. Direct seed into holes in plastic. Cucumbers seeded into black plastic usually produce larger yields, as well earlier ones.\n" +
                        "\n" +
                        "For extra early crops, start plants inside 3 to 4 weeks before transplanting. Sow 3 seeds per pot in 2-inch pots. Thin to one or two plants per pot. Grow above 70 F during the day and above 60 F at night. Be careful when hardening-off plants not to expose them to cold temperatures.\n" +
                        "\n" +
                        "Plants with one or two true leaves transplant best. Transplant into black plastic mulch or warm garden soil after danger of frost has passed and weather has settled. Be careful not to damage roots when transplanting. If using peat pots, make sure they are saturated before transplanting and completely buried. If using row covers, remove when flowers begin to blossom to assure good pollination.\n" +
                        "\n" +
                        "For a continuous harvest, make successive plantings every 2 to 3 weeks until about 3 months before first fall frost date. About 1 month before first frost, start pinching off new flowers so plants channel energy into ripening existing fruit.\n" +
                        "\n" +
                        "To save space, train vining cucumbers to a trellis. (Make sure the trellised plants don’t shade other sun-loving plants.) This also increases air circulation (reducing disease problems), makes harvest easier and produces straighter fruit. Set up trellis before planting or transplanting to avoid root injury. Space plants about 10 inches apart. Pinch back vines that extend beyond the trellis to encourage lateral growth.\n" +
                        "\n" +
                        "Most cucumbers have both male and female flowers. The male flowers blossom first and produce pollen, but no fruit. Other varieties produce female flowers predominately or exclusively. Seed packs of these varieties include a few seeds (usually marked with dye) of another variety that produces male flowers to provide pollen. Make sure you don’t remove pollinator plants when thinning.\n" +
                        "\n" +
                        "Cucumbers are heavy feeders and require fertile soil, nitrogen fertilizer, and/or additions of high-N organic matter sources. Pale, yellowish leaves indicate nitrogen deficiency. Leaf bronzing is a sign of potassium deficiency.\n" +
                        "\n" +
                        "To reduce pest and disease pressure, do not plant cucumbers where you’ve grown them in the last two years. Choose resistant varieties to prevent many diseases and/or trellis vining varieties to encourage good air circulation.";
            case "Eggplants":
                return "Start inside about 6 weeks before last frost date (or about 8 weeks before expected transplanting). Plant 1/4 inch deep in flats or cell-type containers. Keep soil warm (about 80 F to 90 F if possible) until emergence. Eggplant will not germinate in cool soil.\n \n" +
                        "Harden off plants carefully before transplanting by reducing temperature and water.\n" +
                        "\n" +
                        "Wait until weather has settled, all chance of frost has passed and soil is in the 60s F before transplanting, perhaps 2 to 3 weeks after the average last frost date. Cool conditions can weaken plants. Frost will kill them.\n" +
                        "\n" +
                        "Consider using raised beds or black plastic mulch to warm soil and speed early-season growth. If using organic mulches to help retain moisture, do not apply until the soil has warmed.\n" +
                        "\n" +
                        "Set transplants 18 to 24 inches apart in rows 30 to 36 inches apart.\n" +
                        "\n" +
                        "Use row covers to protect plants from pests.\n" +
                        "\n" +
                        "If season is cool, fruit set may be inconsistent. Plants with heavy fruit set benefit from staking.\n" +
                        "\n" +
                        "Eggplants are heavy feeders, but avoid high-nitrogen fertilizers. They may encourage lush foliage growth at the expense of fruit.\n" +
                        "\n" +
                        "Pinch off blossoms 2 to 4 weeks before first expected frost so that plants channel energy into ripening existing fruit, not producing new ones.\n" +
                        "\n" +
                        "To help reduce disease, do not plant eggplants or other tomato-family crops in the same location more than once every three or four years.";
            case "Kale":
                return "Direct seed about three months before expected fall frost. Plant seeds ¼ to ½ inch deep, 1 inch apart in rows 18 to 30 inches apart. Thin to 12- to 18-inch spacings. Eat or transplant thinnings.\n \n" +
                        "Similar to cabbage and other cole crops, you can also set out transplants in spring 4 to 6 weeks before average last frost, 12 inches apart, rows 18 to 24 inches apart.\n" +
                        "\n" +
                        "Doesn't seem to be as troubled by pests as most other cole crops. Use floating row covers to help protect from early insect infestations.\n" +
                        "\n" +
                        "To help reduce disease, do not plant kale or other cole crops in the same location more than once every three or four years.";
            case "Leaf Lettuce":
                return "Direct seed or transplant in early spring, as soon as you can work the soil. To get an early start, prepare beds the previous fall by working in manure or compost and raking smooth to leave a fine seedbed.\n \n" +
                        "Direct-seeding: Sow seed 1/8 inch deep, 1 inch apart in rows 12 to 18 inches apart. When plants have two or three true leaves, thin to 12-inch spacings for crisphead varieties, 6 to 10 inches for other types. You can also lightly broadcast seed (particularly of looseleaf varieties) in a patch instead of a row.\n" +
                        "\n" +
                        "Transplants: Sow in 1-inch cells 3 to 4 weeks before transplanting outside. Harden seedlings by reducing water and temperature for 3 days before transplanting. Hardened plants should survive 20 F. Space crisphead transplants 12 inches apart in rows 18 inches apart. Space other varieties 6 to 10 inches apart in rows 12 to 18 inches apart.\n" +
                        "\n" +
                        "Seeds need light to germinate, so do not plant too deep.\n" +
                        "\n" +
                        "Make succession plantings every week or two. Grow several varieties with different maturity dates for a continuous supply.\n" +
                        "\n" +
                        "Lettuce has a shallow root system. Keep soil moist to keep plants growing continuously. Mulch to retain moisture and suppress weeds (unless slugs are a problem).\n" +
                        "\n" +
                        "Moisture stress and high temperatures, particularly at night, encourage bolting. As the season progresses, plant more bolt-resistant varieties. Locate plants where they will be partially shaded by taller nearby plants, latticework or other screen.\n" +
                        "\n" +
                        "Use row covers to protect very early plantings from cold, to protect young plants from insects, and (supported by hoops) to shade crops when warm weather arrives.\n" +
                        "\n" +
                        "For fall crops, time maturity around time of first expected frost. Mature plants aren’t as tolerant of freezing as seedlings.";
            case "Peppers":
                return "Sow seeds indoors, 1/4 inch deep in flats, peat pots or cellpacks, 8-10 weeks before you anticipate transplanting outside. Seed germinates best when soil temperature is 80 F or higher. It will not germinate below 55 F.\n \n" +
                        "Keep plants indoors in a warm (70 F during the day, 65 F at night), sunny location. Lack of light will produce leggy, unproductive transplants.\n" +
                        "\n" +
                        "Don't be in a rush to transplant outside. Cold temperatures can weaken plants and they may never fully recover. A few days at 60 F to 65 F with reduced water will help harden plants and reduce transplant shock. Over-hardened plants grow slowly after transplanting.\n" +
                        "\n" +
                        "Set plants out 2 to 3 weeks after average last frost when the soil has warmed and the weather has settled. Plant them 12 to 24 inches apart, in rows 24 to 36 inches apart, or spaced about 14 to 16 inches apart in raised beds.\n" +
                        "\n" +
                        "Use black plastic and/or row covers to speed soil warming and early growth. Use caution with row covers not to overheat plants and cause them to drop their blossoms.\n" +
                        "\n" +
                        "If not using black plastic, mulch plants after they are well established and the soil has warmed to retain moisture and control weeds.\n" +
                        "\n" +
                        "Peppers can be temperamental when it comes to setting fruit if temperatures are too hot or too cool. Nighttime temperatures below 60 F or above 75 F can reduce fruit set.\n" +
                        "\n" +
                        "Too much nitrogen fertilizer may promote lush vegetative growth but fewer fruits. Peppers usually responds well to phosphorus fertilizer.\n" +
                        "\n" +
                        "Stake tall varieties for earlier and heavier harvest.\n" +
                        "\n" +
                        "Peppers need even moisture for best performance. An even supply can reduce blossom end rot, a disorder caused by lack of calcium.\n" +
                        "\n" +
                        "Do not plant in same spot more than once every 4 years.";
            case "Radish":
                return "Grows best in cool (50 F to 65 F), moist weather. Hot weather reduces quality and increases pungency. Late plantings may bolt before edible root forms.\n \n" +
                        "About 3 to 6 weeks before average last frost, direct seed ½ inch deep, 1 inch apart, in rows 12 inches apart. Thin to about 2-inch spacings. Crowded plants may not produce high-quality roots. Use thinings in salads.\n" +
                        "\n" +
                        "For continuous harvest, make additional plantings every 1 to 2 weeks until temperatures average in the mid 60s F, or plant varieties with different maturity dates in a single planting. Resume planting when weather cools in fall.\n" +
                        "\n" +
                        "Plant most winter varieties so that they mature around the first fall frost date. (Frost improves flavor and texture of most winter varieties.) Larger winter varieties need more space than spring varieties, so thin to about 6-inch spacings, depending on variety.\n" +
                        "\n" +
                        "Keep soil moist for uninterrupted growth and best quality.\n" +
                        "\n" +
                        "Adding nitrogen fertilizer or nitrogen rich manure close to planting may produce lush tops and small roots.\n" +
                        "\n" +
                        "Can be sown in the same row with carrots, parsley, parsnips and other slow germinating crops. The radishes help to break soil crust for the weaker and later-germinating crops.\n" +
                        "\n" +
                        "Because they mature quickly, radishes make a good intercrop along with slower growing crops, such as other cabbage family crops, or tomato- or squash family crops. Or follow radish harvest with summer succession crops such as beans, or fall-harvested crops.\n" +
                        "\n" +
                        "To help reduce disease, do not plant radishes or other cole crops in the same location more than once every three or four years.";
            case "Tomatoes":
                return "If you purchase transplants, look for sturdy, short, dark green plants. Avoid plants that are tall, leggy, or yellowish, or have started flowering. Transplants that are too mature often stall after transplanting while younger, smaller plants pass them by, producing earlier and more fruit.\n \n" +
                        "Starting your own plants from seed gives you more choices of which variety to grow. But if you start your own plants, be sure you have a place where they can get enough light. Even a sunny, south-facing window is barely adequate. Consider using a grow light to supplement sunlight.\n" +
                        "\n" +
                        "Don’t start plants too early. Sow seeds indoors 6 to 8 weeks before transplanting outside. Plant them 1/8 inch deep in sterile seed starting mix in flats or cells. Seeds germinate best at 75 F to 90 F. Then grow transplants at about 70 F.\n" +
                        "\n" +
                        "Don’t rush to transplant, either. Cold soil and air temperatures can stress plants. Wait at least a week or two after the last frost. Nighttime temperatures should be consistently above 45 F. Use black plastic mulch to warm soil and/or row covers, hot caps or other protection to keep plants warm early in the season. Remove covers whenever temperatures exceed 85 F.\n" +
                        "\n" +
                        "Harden off plants before transplanting by reducing water and fertilizer, not by exposing to cold temperatures, which can stress them and stunt growth. Transplants exposed to cold temperatures (60 F to 65 F day and 50 F to 60 F night) are more prone to catfacing. + \n" +
                        "Unlike most plants, tomatoes do better if planted deeper than they were grown in containers. Set them in the ground so that the soil level is just below the lowest leaves. Roots will form along the buried stem, establishing a stronger root system.\n" +
                        "\n" +
                        "To reduce root disease risk, don't plant on soils that have recently grown tomatoes, potatoes, peppers or eggplant for at least two years.\n" +
                        "\n" +
                        "Mulch plants after the soil has warmed up to maintain soil moisture and suppress weeds. Tomatoes need a consistent supply of moisture. If it rains less than 1 inch per week, water to make up the difference.\n" +
                        "\n" +
                        "Many factors (in addition to your choice of variety) affect total yield, first harvest and fruit quality. Raised beds, black plastic mulch and providing consistent moisture by watering or through drip irrigation are good ways to improve all three.\n" +
                        "\n" +
                        "How you provide support to plants can also affect performance. Determinate varieties do not need staking. But staking and pruning indeterminate varieties can hasten first harvest by a week or more, improve fruit quality, keep fruit cleaner, and make harvest easier. Staking and pruning usually reduces total yield, but fruits will tend to be larger. Staked and pruned plants are also more susceptible to blossom end rot and sunscald. Allowing indeterminate varieties to sprawl reduces labor, but takes up more space and plants are more prone to disease.\n" +
                        "\n" +
                        "Wooden tomato stakes are typically about 6 feet long and 1 ½ inch square, but you can use similar materials. Drive stakes at least 8 to 10 inches deep at or soon after transplanting so as not to damage roots.\n" +
                        "\n" +
                        "Prune tomatoes to one or two vigorous stems by snapping off “suckers” (stems growing from where leaf stems meet the main stem) when they are 2 to 4 inches long. Tie stems to stake with soft string, twine or cloth, forming a figure-8 with the stem in one loop and the stake in the other. This gives the stem room to expand without being constricted. Start about 8 to 12 inches above the ground and continue to tie at similar intervals as the plant grows. As an alternative to using individual stakes, grow several plants in a row between heavy-duty stakes or posts spaced about 4 feet apart, and use twine to weave in and out around posts and plants.\n" +
                        "\n" +
                        "Growing tomatoes in cages is a good compromise between labor-intensive staking and just letting them sprawl. You can purchase tomato cages at your local garden center, or simply bend a 6-foot-long piece of 4- to 6-inch wire mesh into a cylinder about 22 inches in diameter. (Cattle fencing or concrete reinforcing wire mesh work well for this.) Place cage around plants soon after transplanting and anchor with stakes.\n" +
                        "\n" +
                        "Avoid excessive N applications, which can cause excessive foliage and poor fruit set. Also avoid using fresh manure or high nitrogen fertilizers (those with three or more times nitrogen than phosphorus or potassium). Poor fruit set can also be caused by heavy rainfall or temperatures that are either too high (above 90 F) or too low (below 55 F).\n" +
                        "\n" +
                        "On most soils, you can sidedress about 1/2 cup of 5-10-5 per plant and work shallowly into the top inch of soil when fruits are about 1 inch in diameter and again when harvest begins.";
            case "Snow Peas":
                return "Sow seed in spring as soon as you can work the soil - as early as late March or early April depending on how quickly the soil warms and dries. Peas planted in cold soil (40 F) are slow to germinate. Later plantings made when the soil is warmer (60 F or more) often catch up quickly with earlier plantings. Use raised beds if your soil is slow to drain.\n \n" +
                        "Make additional plantings through early- to mid- May, or plant varieties with different maturity dates to increase the harvest period.\n" +
                        "\n" +
                        "Plant seeds 1 to 2 inches deep, 1 to 4 inches apart in rows 18 inches apart. Or sow about 1 inch apart in a 3-inch-wide band (about 25 seeds per foot).   Shallow planting is best when soils are cool and wet. Plant deeper if soil is dry. A quick way to seed is to make a furrow or trench with a hoe, place seed in the furrow, cover and firm. Do not thin.\n" +
                        "\n" +
                        "Erect trellis for tall-growing, vining types at planting using chicken wire, brush or other suitable trellis material. If trellising, increase row spacing to 4 to 6 feet.\n" +
                        "\n" +
                        "Keep soil moist, but avoid heavy watering during flowering, which can interfere with pollination.\n" +
                        "\n" +
                        "Intercrop peas with fast-growing cool-season crops such as spinach or radishes. After final harvest, follow with late squash plantings or fall-harvested cool-season crops such as broccoli, leeks or potatoes.\n" +
                        "\n" +
                        "Sow fall crops about 8 to 10 weeks before first frost date. Fall crops can be disappointing if hot weather persists. Powdery-mildew-resistant varieties are best for fall crops.\n" +
                        "\n" +
                        "Do not use high-nitrogen fertilizers. Too much nitrogen will result in lush foliage but poor flowering and fruiting. Inoculation with rhizobia bacteria may be beneficial if peas have not been grown in the past.\n" +
                        "\n" +
                        "Do not plant peas in the same place more than once in every 4 years. Avoid planting where in places where peas have suffered before from root rot.";
            case "Swiss Chard":
                return "Start planting about 2 to 3 weeks before last expected frost. Sow seeds ½ to 1 inch deep, 2 to 6 inches apart, in rows 18 to 24 apart. Like beets, chard “seeds” produce more than one plant, and so will require thinning. Thin to 6- to 12-inch spacings.\n \n" +
                        "If you plan to harvest whole plants, make succession plantings through late summer.\n" +
                        "\n" +
                        "Delay planting of ‘Ruby Red’ or ‘Rhubarb’ chard until after last frost. These varieties may go to seed (bolt) if seed is exposed to freezing temperatures.\n" +
                        "\n" +
                        "Start seed inside for earlier crops, or if you want to arrange different colored plants of the variety ‘Bright Lights.’\n" +
                        "\n" +
                        "Mulch plants to retain moisture and suppress weeds.\n" +
                        "\n" +
                        "You can begin harvesting when leaves reach usable size. Remove a leaf or two from each plant, or cut plants an inch or two above the soil for cut-and-come-again harvest. Avoid damaging the growing point in the center of the plant at harvest.\n" +
                        "\n" +
                        "As plants age, older leaves get tough. Cut plants back to about 3 to 5 inches tall to encourage a flush of new, tender growth.";
            case "Watermelon":
                return "If you have long, hot growing seasons direct-seed into garden. To ensure ripening in areas with shorter growing seasons and cooler weather, choose fast-maturing varieties, start plants inside, use black or IRT plastic mulch to warm soil and use fabric row covers to protect plants.\n \n" +
                        "Direct-seed 1 to 2 weeks after average last frost when soil is 70 F or warmer. Plant ½ inch deep, 6 seeds per hill, hills 4 to 6 feet apart; or 1 foot apart in rows 5 feet apart. Can plant at closer spacings if trellised. Thin to 2 to 3 plants per hill.\n" +
                        "\n" +
                        "For transplanting, sow seeds indoors ¼ inch deep in peat pots (2-inch square or bigger), 2 to 4 weeks before setting out. Plants should have one or two true leaves when transplanted.\n" +
                        "\n" +
                        "Transplant at same spacings as direct-seeded crops - 2 to 3 plants per hill in hills spaced 4 to 6 feet apart, or 1 to 2 feet apart in rows 5 feet apart. Transplants are delicate and roots are sensitive to disturbance. If you need to thin, use scissors. Keep soil intact around plant when transplanting.\n" +
                        "\n" +
                        "Mulch plants after soil has warmed to help maintain consistent moisture and suppress weeds.\n" +
                        "\n" +
                        "If using fabric row covers, remove at flowering to allow pollination by bees. Good pollination is critical to fruit set.\n" +
                        "\n" +
                        "Plants require consistent moisture until pollination. Once fruits are about the size of a tennis ball, only water if soil is dry and leaves show signs of wilting.\n" +
                        "\n" +
                        "To prevent insect damage to developing fruits, place melons on pots or pieces of wood.\n" +
                        "\n" +
                        "If growing melons on a trellis, support fruit with slings made from netting, fabric, or pantyhose. Trellising improves air circulation around plants and can help reduce foliar disease problems. Choose small-fruited varieties and reduce plant spacing.\n" +
                        "\n" +
                        "For large plantings, leave a strip of rye cover crop every second or third row perpendicular to prevailing winds to protect plants from damaging wind.\n" +
                        "\n" +
                        "To reduce insect and disease problems, avoid planting cucumber family crops (melons, squash, pumpkins) in the same spot two years in a row.";
            case "Zucchini":
                return "Squash like warm soil and are very sensitive to frost. So don’t be in a rush to plant early in spring. Wait until danger of frost has passed and soil has warmed to about 70 F, or about 2 weeks after the last frost date.\n \n" +
                        "Direct seed ½ to 1 inch deep into hills (which warm and drain earlier in the season) or rows. Sow 4 to 5 seeds per hill. Space hills 3 to 4 feet apart. When the plants are 2 to 3 inches tall, thin to 2 to 3 plants per hill by snipping off unwanted plants without disturbing the roots of the remaining ones. In rows, sow seeds 4 inches apart in rows 4 to 5 feet apart. Snip off plants to thin to one plant every 12 to 24 inches.\n" +
                        "\n" +
                        "For extra early crops, start inside in 2- to 3-inch pots or cells 3 to 4 weeks before transplanting outside. Sow 3 or 4 seeds per pot and thin to one or two plants by snipping off the weaker plants to avoid damaging the roots of those that remain. Harden off by cutting back on water and reducing temperature before transplanting. Plant transplants out in the garden about 1 to 2 feet apart after all danger of frost has passed.\n" +
                        "\n" +
                        "To hasten first harvest by as much as 2 weeks, use black plastic mulch to warm soil before direct seeding or transplanting. Early fruits are sometimes wrinkled, turn black or rot due to poor pollination.\n" +
                        "\n" +
                        "At the end of the season, remove or till in vines to reduce mildew. Use row covers to protect plants early in the season and to prevent insect problems. Remove cover before flowering to allow pollination by insects or when hot weather arrives.\n" +
                        "\n" +
                        "Mulching plants helps retain moisture and suppress weeds. Mounding soil around the base of the plants can discourage squash borers from laying eggs.";
            default:
                return "";
        }
    }
}
