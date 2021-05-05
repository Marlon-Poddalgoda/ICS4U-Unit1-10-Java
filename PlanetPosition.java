import java.util.Scanner;
/**
 * This program returns the planet position using an enum.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-04
 */

public final class PlanetPosition {
    private PlanetPosition() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This enum holds the names of the planets.
    * @return planetEnum This value holds the number of the planet.
    */
    enum Planets {
        // list of planets in the solar system

        /**
        * Mercury, first planet.
        */
        MERCURY(1),
        /**
        * Venus, second planet.
        */
        VENUS(2),
        /**
        * Earth, third planet.
        */
        EARTH(3),
        /**
        * Mars, fourth planet.
        */
        MARS(4),
        /**
        * Jupiter, fifth planet.
        */
        JUPITER(5),
        /**
        * Saturn, sixth planet.
        */
        SATURN(6),
        /**
        * Uranus, seventh planet.
        */
        URANUS(7),
        /**
        * Neptune, eigth planet.
        */
        NEPTUNE(8),
        /**
        * Pluto, ninth "planet".
        */
        PLUTO(9);

        /**
        * @param planetEnum This value holds the number value of a planet.
        */
        private int planetEnum = 0;

        /**
        * Finds where the planet is located.
        * @param positionEnum
        */
        Planets(final int positionEnum) {
            // assigns planet number to planet
            this.planetEnum = positionEnum;
        }

        // return statement
        public int showPosition() {
            return planetEnum;
        }
    }

    /**
    * This method takes in user input.
    * @param args
    */
    public static void main(final String[] args) {
        // try statement
        try {
            // Create new Scanner-type variable
            Scanner planetInput = new Scanner(System.in);

            // variables
            String planetString;
            String userString;
            int planetNumber;

            // basic instructions
            System.out.println("This planet position program returns the"
                            + " position of any planet in our solar system.");
            System.out.println();

            // Asks user to enter one of several choices
            System.out.print("Enter any planet from our solar system: ");
            // take in user input
            userString = planetInput.nextLine();
            // capitalize user input
            planetString = userString.toUpperCase();
            // call on enum
            Planets planetName = Planets.valueOf(planetString);
            // call planet position
            planetNumber = planetName.showPosition();

            // print out planet position to user
            System.out.println();
            System.out.println("The planet " + userString + " is number "
                                + planetNumber + " in the solar system.");
        // catch statement
        } catch (Exception e) {
            // error catch
            System.out.println();
            System.out.println("Sorry, please enter the name of a planet.");
        }

        System.out.println();
        System.out.println("Done.");
    }
}
