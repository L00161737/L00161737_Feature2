package main.java;


/**
 * This class provides functionality for managing Bokoblin camp entry points.
 */
public class Feature2 {

    /**
     * Returns a list of available Bokoblin camps.
     *
     * @return an array of camp names
     */
    public String[] getCamps() {
        // Returning the list of camps
        return new String[] {"North Camp", "South Camp", "East Camp", "West Camp"};
    }

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Bokoblin Camp Entry Points Feature!");
        Feature2 feature = new Feature2();

        // Displaying the list of camps
        System.out.println("Available Camps:");
        for (String camp : feature.getCamps()) {
            System.out.println("- " + camp);
        }
    }
}


// Triggering GitHub Actions