import java.util.ArrayList;

public class Seventeen {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Empty the ArrayList
        colors.clear();

        System.out.println("ArrayList after emptying: " + colors);
    }
}
