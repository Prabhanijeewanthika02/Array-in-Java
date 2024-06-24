# Arrays in Java

## Overview

An array in Java is a group of variables that are referred to by a common name. It can hold many variables of the same data type and is a collection of similar values. Each data item in an array is called an element, and these elements are accessed using an index value that starts with 0.

## Declaring an Array

You can declare an array in Java using either of the following syntaxes:
```java
data_type array_name[];
// or
data_type[] array_name;
```

### Examples:
```java
int num[];
char[] vowels;
```

## Declaring and Creating an Array

To declare and create an array, you specify the type of the elements, the name of the array, and the size of the array using the `new` keyword.

### Example:
```java
int age[] = new int[6];
```

## Creating an Array

You can create an array and assign it to a previously declared array variable.

### Example:
```java
array_name = new data_type[size];
age = new int[6];
```

## Initializing an Array

You can initialize an array by specifying the values of its elements at the time of creation or by assigning values individually.

### Example:
```java
age[0] = 26; // Initializing individually
// or
int age[] = {26, 81, 34, 52, 67, 32}; // Initializing at the time of creation
```

## Accessing the Values of an Array

To refer to a value in an array, use the name of the array followed by the index (subscript) in square brackets.

### Example:
```java
int marks[] = {65, 53, 98, 35, 76, 49};
System.out.println(marks[0]); // Accessing the first element
```

## Example Code and Explanation

### Initializing the Elements of an Array
```java
public class Arrays {
    public static void main(String[] args) {
        int scores[] = {16, 47, 53, 32}; // Initializing array with values
        System.out.println("Score 1 is : " + scores[0]); // Accessing and printing each element
        System.out.println("Score 2 is : " + scores[1]);
        System.out.println("Score 3 is : " + scores[2]);
        System.out.println("Score 4 is : " + scores[3]);
    }
}
```

### Explanation
- `int scores[] = {16, 47, 53, 32};` - This line declares and initializes an array named `scores` with 4 elements.
- `System.out.println("Score 1 is : " + scores[0]);` - This line accesses the first element of the array (`scores[0]`) and prints it.

### Assigning Values to the Elements of an Array
```java
public class Arrays {
    public static void main(String[] args) {
        int scores[] = new int[4]; // Creating an array of size 4
        scores[0] = 59; // Assigning values to each element
        scores[1] = 78;
        scores[2] = 62;
        scores[3] = 423;
        System.out.println("Score 1 is : " + scores[0]); // Printing each element
        System.out.println("Score 2 is : " + scores[1]);
        System.out.println("Score 3 is : " + scores[2]);
        System.out.println("Score 4 is : " + scores[3]);
    }
}
```

### Explanation
- `int scores[] = new int[4];` - This line declares and creates an array named `scores` with 4 elements.
- `scores[0] = 59;` - This line assigns the value 59 to the first element of the array.
- `System.out.println("Score 1 is : " + scores[0]);` - This line accesses the first element of the array (`scores[0]`) and prints it.

### Inputting Values to an Array Using a For Loop
```java
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int i;
        float price[] = new float[5]; // Creating an array of size 5
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 5; i++) { // Loop to input values into the array
            System.out.println("Enter a value : ");
            price[i] = scan.nextFloat(); // Storing input in the array
        }
        System.out.println("Price 1 is : " + price[0]); // Printing each element
        System.out.println("Price 2 is : " + price[1]);
        System.out.println("Price 3 is : " + price[2]);
        System.out.println("Price 4 is : " + price[3]);
        System.out.println("Price 5 is : " + price[4]);
    }
}
```

### Explanation
- `float price[] = new float[5];` - This line declares and creates an array named `price` with 5 elements.
- `Scanner scan = new Scanner(System.in);` - This line creates a Scanner object to read input from the user.
- `for (i = 0; i < 5; i++) { ... }` - This for loop iterates 5 times to input values into the array.
- `price[i] = scan.nextFloat();` - This line stores the input value in the `i`th element of the array.

### Inputting and Displaying Values of an Array Using For Loops
```java
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int i, j;
        float price[] = new float[5]; // Creating an array of size 5
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 5; i++) { // Loop to input values into the array
            System.out.println("Enter a value : ");
            price[i] = scan.nextFloat(); // Storing input in the array
        }
        for (j = 0; j < 5; j++) { // Loop to print each element
            System.out.printf("Price %d is : %.2f\n", j, price[j]);
        }
    }
}
```

### Explanation
- The first for loop is used to input values into the array.
- The second for loop is used to print each element of the array.

### Displaying a Character Array
```java
public class CharacterArray {
    public static void main(String[] args) {
        int x;
        char vowels[] = {'a', 'e', 'i', 'o', 'u'}; // Initializing array with characters
        for (x = 0; x < 5; x++) { // Loop to print each element
            System.out.printf("%c\t", vowels[x]);
        }
    }
}
```

### Explanation
- `char vowels[] = {'a', 'e', 'i', 'o', 'u'};` - This line declares and initializes a character array named `vowels`.
- `System.out.printf("%c\t", vowels[x]);` - This line prints each character in the array with a tab space.

### Inputting and Displaying String Array Elements
```java
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        final int SIZE = 7;
        String[] days = new String[SIZE]; // Creating an array of size 7
        Scanner scan = new Scanner(System.in);
        for (int x = 0; x < SIZE; x++) { // Loop to input values into the array
            System.out.printf("Enter day %d : ", x + 1);
            days[x] = scan.nextLine(); // Storing input in the array
        }
        for (String name : days) { // Enhanced for loop to print each element
            System.out.println(name);
        }
    }
}
```

### Explanation
- `String[] days = new String[SIZE];` - This line declares and creates an array named `days` with 7 elements.
- `days[x] = scan.nextLine();` - This line stores the input value in the `x`th element of the array.
- `for (String name : days) { ... }` - This enhanced for loop iterates through each element in the `days` array and prints it.

## Conclusion

Arrays in Java are a fundamental data structure used to store and manage collections of similar values. They offer a powerful and flexible way to handle multiple values using a single variable name. By understanding how to declare, create, initialize, and access arrays, you can efficiently manage and manipulate collections of data in your Java programs.
