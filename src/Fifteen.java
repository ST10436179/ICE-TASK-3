import java.util.ArrayList;

public class Fifteen {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Orange");
        colors.add("Silver");
        colors.add("red");

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Blue");
        colors2.add("Yellow");

        // Join list2 into list1
        colors.addAll(colors2);

        System.out.println("Joined ArrayList: " + colors);
    }
}
