import java.util.ArrayList;

public class TwentyOne {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Replace the second element
        colors.set(1, "Brown");

        System.out.println( colors);
    }
}
