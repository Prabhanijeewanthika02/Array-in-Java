public class Arrays { // Class Declaration: Defines a Java class named Arrays

    public static void main(String[] args) { // Main Method: Starts the main method, the entry point of the program
        int scores[] = new int[4]; // Array Initialization: Declares an integer array named scores with a size of 4 elements
        // new int[4];: Allocates memory for an array of integers with four elements. Each element is initially set to the default value for int, which is 0.

        scores[0] = 59; // Assigning Values to Array Elements: Assigns the value 59 to the first element (scores[0]) of the scores array
        scores[1] = 78; // Assigns the value 78 to the second element (scores[1])
        scores[2] = 62; // Assigns the value 62 to the third element (scores[2])
        scores[3] = 423; // Assigns the value 423 to the fourth element (scores[3])

        System.out.println("Score 1 is : " + scores[0]); // Printing Array Elements: Prints the value of the first element (scores[0]), preceded by the string "Score 1 is : "
        System.out.println("Score 2 is : " + scores[1]); // Prints the value of the second element (scores[1]), preceded by "Score 2 is : "
        System.out.println("Score 3 is : " + scores[2]); // Prints the value of the third element (scores[2]), preceded by "Score 3 is : "
        System.out.println("Score 4 is : " + scores[3]); // Prints the value of the fourth element (scores[3]), preceded by "Score 4 is : "
    } // End of Main Method

} // End of Arrays class
