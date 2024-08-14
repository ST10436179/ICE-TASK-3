import java.util.ArrayList;
import java.util.Collections;

public class Eighth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Red");

        // Sort the ArrayList
        Collections.sort(colors);

        // Display the sorted ArrayList
        System.out.println("Sorted ArrayList: " + colors);
    }
}
