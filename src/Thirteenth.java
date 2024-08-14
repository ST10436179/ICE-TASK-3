import java.util.ArrayList;

public class Thirteenth {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Yellow");
        colors1.add("Sliver");
        colors1.add("Brown");

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Yellow");
        colors2.add("Sliver");
        colors2.add("Brown");

        // Compare the two ArrayLists
        boolean areEqual = colors1.equals(colors2);

        // Display the comparison result
        if (areEqual) {
            System.out.println("The ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }
    }
}
