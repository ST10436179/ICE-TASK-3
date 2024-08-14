import java.util.ArrayList;

public class Seveth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Element to search for
        String searchElement = "Silver";

        // Search for the element in the ArrayList
        boolean foundElement = colors.contains(searchElement);

        // Display the search result
        if (foundElement) {
            System.out.println(searchElement + " is  available in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not available in the ArrayList.");
        }
    }
}
