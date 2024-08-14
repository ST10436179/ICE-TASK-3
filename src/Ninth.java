import java.util.ArrayList;

public class Ninth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Red");

        ArrayList<String> colors2 = new ArrayList<>();

        // Copy elements from colors to colors2
        colors2.addAll(colors);

        // Display the contents of both ArrayLists
        System.out.println("Original ArrayList: " + colors);
        System.out.println("Copied ArrayList: " + colors2);
    }
}
