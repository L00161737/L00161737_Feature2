package main.java;

/**
 * Represents the Bokoblin Camp Entry Points feature.
 * This feature helps identify entry points to Bokoblin camps
 * and lists the available camps for resource collection.
 */
public class Feature2 {

    /**
     * Retrieves the names of available camps.
     *
     * @return an array of strings containing the names of the camps
     */
    public String[] getCamps() {
        return new String[] { "North Camp", "South Camp", "East Camp", "West Camp" };
    }

    /**
     * Main method for demonstrating the feature.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Feature2 feature = new Feature2();
        System.out.println("Welcome to the Bokoblin Camp Entry Points Feature!");
        System.out.println("Available Camps:");
        for (String camp : feature.getCamps()) {
            System.out.println("- " + camp);
        }
    }
}
