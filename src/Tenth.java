import java.util.ArrayList;
import java.util.Collections;

public class Tenth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Sliver");

        // Shuffle the ArrayList
        Collections.shuffle(colors);

        // Display the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + colors);
    }
}
