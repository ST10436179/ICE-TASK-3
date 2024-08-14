import java.util.ArrayList;
import java.util.Collections;

public class Fourteen {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Swap elements at index 1 and index 3
        Collections.swap(colors, 0, 2);

        System.out.println("ArrayList after swap: " + colors);
    }
}
