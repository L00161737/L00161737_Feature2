package src.main.java;

public class Feature2 {

    // Method to get an array of available camps
    public String[] getCamps() {
        // Returning the list of camps
        return new String[] {"North Camp", "South Camp", "East Camp", "West Camp"};
    }

    // Main method for basic output
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