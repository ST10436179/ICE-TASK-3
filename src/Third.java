import java.util.ArrayList;

public class Third {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Navy");

        // Insert an element
        colors.add(0, "Green");

        // Print the ArrayList
        for (String color : colors) {
            System.out.println(color);
        }
    }
}




