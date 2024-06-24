import java.util.Scanner; // Importing Scanner class from java.util package

public class Arrays { // Class Declaration: Defines a Java class named Arrays
    
    public static void main(String[] args) { // Main Method: Starts the main method, the entry point of the program
        
        int i, j; // Variable Declaration: Declares integer variables i and j
        
        float price[] = new float[5]; // Array Initialization: Creates an array named price of size 5 to store float values
        
        Scanner scan = new Scanner(System.in); // Scanner Initialization: Creates a Scanner object named scan to read input from the console
        
        for (i = 0; i < 5; i++) { // For Loop: Iterates i from 0 to 4 to input values into the array
            
            System.out.println("Enter a value : "); // Printing prompt message to enter a value
            
            price[i] = scan.nextFloat(); // Input Reading: Reads a float value from the console input and assigns it to the current index i of the price array
        }
        
        for (j = 0; j < 5; j++) { // For Loop: Iterates j from 0 to 4 to print each element of the array
            
            System.out.printf("Price %d is : %.2f\n", j + 1, price[j]); // Output Formatting: Prints each element of the price array with two decimal places
        }
    }
}
