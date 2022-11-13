import java.util.Random;
import java.util.Scanner;

public class FeedingPopulation {

    Random rand = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static int askHowMuchGrainToFeedPeople(int bushelsOwned, int bushelsToSurvive) {
        //Hammurabi.getYearlyUpdate();

        System.out.print(   "\nEach person needs " + bushelsToSurvive+ " bushels to survive." +
                            "\nEnter the amount of bushels you wish to feed your population: ");
        int amountToFeed = scanner.nextInt();

        if(amountToFeed > bushelsOwned) {
            System.out.println("\n[NOTICE] You don't have " + amountToFeed + " bushels of grain to feed your population.");
            return askHowMuchGrainToFeedPeople(bushelsOwned, bushelsToSurvive);
        } else {
            System.out.println("\n[NOTICE] You are able to feed your population with " + amountToFeed + " bushels of grain.");
            return amountToFeed;
        }
    }
    public static int feedPopulationReturnDeaths(int population, int amountToFeed, int bushelsToSurvive) {

        return population - ((int) Math.floor(amountToFeed / bushelsToSurvive));
    }

    public static int updatePopulation(int population, int diedFromStarvation) {

        return 0;
    }

    public static int updateBushels(int bushelsOwned, int amountToFeed) {

        return 0;
    }

    public static boolean uprising(int population, int howManyPeopleStarved) {
        //Return true if more than 45% of the people starve.
        //(This will cause you to be immediately thrown out of office, ending the game.)
        return true;
    }

    public static int immigrants(int population, int acresOwned, int grainInStorage) {
        //Nobody will come to the city if people are starving (so don't call this method).
        // If everyone is well fed, compute how many people come to the city as:
        // (20 * _number of acres you have_ + _amount of grain you have in storage_) / (100 * _population_) + 1.
        return 0;
    }

    public static int addImmigrants(int population, int immigrants) {

        return  0;
    }
}