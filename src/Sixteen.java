import java.util.ArrayList;

public class Sixteen {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        // Clone the ArrayList
        ArrayList<String> clone = (ArrayList<String>) colors.clone();

        System.out.println("Cloned ArrayList: " + clone);
    }
}
