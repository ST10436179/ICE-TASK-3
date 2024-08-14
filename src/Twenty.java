import java.util.ArrayList;

public class Twenty {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        System.out.println("ArrayList before ensuring capacity: " + colors);

        // Increase the capacity of the ArrayList
        colors.ensureCapacity(9);

        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println("ArrayList after ensuring capacity: " + colors);
    }
}
