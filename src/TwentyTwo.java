import java.util.ArrayList;

public class TwentyTwo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Print elements with index
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }
    }
}
