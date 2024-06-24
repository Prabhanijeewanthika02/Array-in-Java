import java.util.Scanner; // Importing Scanner class from java.util package

public class Arrays { // Class Declaration: Defines a Java class named Arrays
    
    public static void main(String[] args) { // Main Method: Starts the main method, the entry point of the program
        
        int i; // Variable Declaration: Declares an integer variable i
        
        float price[] = new float[5]; // Array Initialization: Creates an array named price of size 5 to store float values
        
        Scanner scan = new Scanner(System.in); // Scanner Initialization: Creates a Scanner object named scan to read input from the console
        
        for (i = 0; i < 5; i++) { // For Loop: Iterates i from 0 to 4 to input values into the array
            
            System.out.println("Enter a value : "); // Printing prompt message to enter a value
            
            price[i] = scan.nextFloat(); // Input Reading: Reads a float value from the console input and assigns it to the current index i of the price array
        }
        
        System.out.println("Price 1 is : " + price[0]); // Printing Array Element: Outputs the first element of the price array
        System.out.println("Price 2 is : " + price[1]); // Outputs the second element of the price array
        System.out.println("Price 3 is : " + price[2]); // Outputs the third element of the price array
        System.out.println("Price 4 is : " + price[3]); // Outputs the fourth element of the price array
        System.out.println("Price 5 is : " + price[4]); // Outputs the fifth element of the price array
    }
}
