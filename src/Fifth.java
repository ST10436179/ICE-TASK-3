import java.util.ArrayList;

public class Fifth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");


        colors.set(0, "Yellow");

        // Display the updated ArrayList
        System.out.println("Updated ArrayList: " + colors);
    }
}


