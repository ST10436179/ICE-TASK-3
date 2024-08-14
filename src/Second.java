import java.util.ArrayList;

public class Second {
    public static void main(String[] args){


                ArrayList<String> colors = new ArrayList<>();
                colors.add("Pink");
                colors.add("Blue");
                colors.add("Orange");
                colors.add("Yellow");
                colors.add("red");
                // loop through array
                System.out.println("Iterating through the ArrayList:");
                for (String color : colors) {
                    System.out.println(color);
                }
            }
}
