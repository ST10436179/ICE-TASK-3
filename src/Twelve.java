import java.util.ArrayList;
import java.util.List;

public class Twelve {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Extract a portion of the ArrayList
        List<String> subList = colors.subList(0, 2);

        // Display the extracted portion
        System.out.println("Extracted portion of the ArrayList: " + subList);
    }
}
