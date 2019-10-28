/*
Try the following exercises:

1. Write a Java program to create a new array list to hold colors.
2. Add at least 3 colors (string) to the array list and print out all its values.
3. Using the array list created above, print out the value at index 1.
4. Using the array list above, prompt the user for one new color, and add that color to the array list.
5. Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit. Each time the user
enters a color, add that to the array list. Print out the list at the end.
=============================================
 */


import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistColors {

    public static void main(String[] args) {

        // Create an arraylist that will hold colors

        Scanner keybd = new Scanner(System.in);
        ArrayList<String> color = new ArrayList<String>();
        System.out.println("An array list of initial size of : " + color.size() + " has been created and ");

        // Add elements to the arraylist
        color.add("Red");
        color.add("BLUE");
        color.add("green");
        color.add("yELLOW");

        // Display the arraylist
        System.out.println("THE COLORS ARE: " + color);
        System.out.println("The color at index 1 is : " + color.get(1));

        String again, clr;

            System.out.println("please enter a color of your choice : ");
            clr = keybd.nextLine();
            color.add(clr);
            System.out.println("THE COLORS ARE: " + color);
            System.out.println("press q to quit ");
            again = keybd.nextLine();

    }
}