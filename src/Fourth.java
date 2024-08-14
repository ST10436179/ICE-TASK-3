import java.util.ArrayList;


public class Fourth {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("red");

        int indexPosition = 2;
        String element = colors.get(indexPosition);

        // Print the retrieved element
        System.out.println("Color at index " + indexPosition + ": " + element);
    }
}


