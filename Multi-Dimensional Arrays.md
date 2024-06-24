### Two-Dimensional Arrays

#### Overview
- **Definition**: A two-dimensional array is like a grid where each element is identified by two indices: row and column.
  
#### Declaration and Initialization
- **Example**: `int marks[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};`
- **Explanation**: Declares and initializes a 2D array `marks` with 3 rows and 4 columns.

#### Accessing Elements
- **Example**: `System.out.println(marks[0][2]);`
- **Explanation**: Accesses and prints the element in the first row and third column (value: 3).

#### Example Code
```java
public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // Displaying the values
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
```
- **Explanation**: This program initializes a 2D array `a`, loops through its elements, and prints them row by row.

#### Output
```
1   2   3   4
5   6   7   8
9   10  11  12
```

### Three-Dimensional Arrays

#### Overview
- **Definition**: A three-dimensional array extends the concept of a 2D array into three dimensions, adding depth.
  
#### Declaration and Initialization
- **Example**: `int n[][][] = new int[2][4][3];`
- **Explanation**: Declares and initializes a 3D array `n` with 2 layers, each layer having 4 rows and 3 columns.

#### Example Code
```java
public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] n = new int[2][4][3];
        // Assigning values
        n[0][0][0] = 1;
        n[1][3][2] = 5;
        // Accessing and printing values
        System.out.println(n[0][0][0]); // Prints 1
        System.out.println(n[1][3][2]); // Prints 5
    }
}
```
- **Explanation**: This program demonstrates initializing a 3D array `n`, assigning values to specific elements, and printing them.

#### Output
```
1
5
```

### Summary
- **Two-Dimensional Arrays**: Represented as rows and columns, useful for grids and matrices.
- **Three-Dimensional Arrays**: Extend the concept to add depth, useful for representing 3D structures or multi-layered data.

Understanding these concepts will help you work with arrays effectively in Java, handling multi-dimensional data structures as needed for various applications.
