package _01_04;

import java.util.ArrayList;

import org.xml.sax.SAXException;

public class MenuBuilder {
  public static void main(String[] args) {

    // Create a variable called menuTitle of type String and assign it the value "My
    // Dream Menu:".
    String menuTitle = "My Dream Menu:";

    // Print the menuTitle variable to the console.
    System.out.println(menuTitle);
    // Create a variable called menu of type ArrayList.
    ArrayList<MenuItem> menu = new ArrayList<>();
    // Create a variable called starter of type MenuItem and pass in the name of
    // your favourite starter.
    MenuItem starter = new MenuItem("honey-chilli-potato");

    // Add the starter variable to the ArrayList called menu.
    menu.add(starter);

    // Create a variable called mainCourse of type MenuItem and pass in the name of
    // your favourite main course.
    MenuItem mainCourse = new MenuItem("rice-and-dal");

    // Add the mainCourse variable to the ArrayList called menu.
    menu.add(mainCourse);
    // Create a variable called dessert of type MenuItem and pass in the name of
    // your favourite dessert.
    MenuItem dessert = new MenuItem("tiramisu");

    // Add the dessert variable to the ArrayList called menu.
    menu.add(dessert);

    // Print the menu variable to the console.
    System.out.println(menu);
  }
}
