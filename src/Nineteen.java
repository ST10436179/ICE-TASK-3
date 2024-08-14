import java.util.ArrayList;

public class Nineteen {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(14);
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        System.out.println("ArrayList capacity before trimming: " + colors.size());

        // Trim the capacity of the ArrayList
        colors.trimToSize();

        System.out.println("ArrayList capacity after trimming: " + colors.size());
    }
}
