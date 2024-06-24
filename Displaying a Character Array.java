public class CharacterArray { // Class Declaration: Defines a Java class named CharacterArray

    public static void main(String[] args) { // Main Method: Starts the main method, the entry point of the program
        
        int x; // Variable Declaration: Declares an integer variable x
        
        char vowels[] = {'a', 'e', 'i', 'o', 'u'}; // Array Initialization: Creates an array named vowels with characters 'a', 'e', 'i', 'o', 'u'
        
        for (x = 0; x < 5; x++) { // For Loop: Iterates x from 0 to 4 to print each element of the vowels array
            
            System.out.printf("%c\t", vowels[x]); // Output Formatting: Prints each character of the vowels array followed by a tab character (\t)
        }
    }
}
