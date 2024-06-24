import java.util.Scanner; // Importing Scanner class from java.util package

public class StringArray { // Class Declaration: Defines a Java class named StringArray
    
    public static void main(String[] args) { // Main Method: Starts the main method, the entry point of the program
        
        final int SIZE = 7; // Variable Declaration: Declares a constant integer SIZE with value 7
        
        String[] days = new String[SIZE]; // Array Initialization: Creates an array named days of size 7 to store strings
        
        Scanner scan = new Scanner(System.in); // Scanner Initialization: Creates a Scanner object named scan to read input from the console
        
        for (int x = 0; x < SIZE; x++) { // For Loop: Iterates x from 0 to 6 to input values into the array
            
            System.out.printf("Enter day %d : ", x + 1); // Printing prompt message to enter a day
            
            days[x] = scan.nextLine(); // Input Reading: Reads a line of input (a day name) from the console and stores it in the current index x of the days array
        }
        
        for (String name : days) { // Enhanced For Loop (foreach loop): Iterates through each element (name) in the days array
            
            System.out.println(name); // Output: Prints each day name stored in the days array
        }
    }
}
