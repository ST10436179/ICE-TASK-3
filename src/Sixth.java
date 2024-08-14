import java.util.ArrayList;

public class Sixth {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Remove the third element
        colors.remove(2);

        System.out.println( colors);
    }
}
