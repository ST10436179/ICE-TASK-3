import java.util.ArrayList;
import java.util.Collections;

public class Eleventh {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Red");

        // Reverse the ArrayList
        Collections.reverse(colors);

        // Display the reversed ArrayList
        System.out.println("Reversed ArrayList: " + colors);
    }
}
