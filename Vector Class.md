
# Vector Class Examples in Java

The `Vector` class in Java is used to create dynamic arrays that can grow or shrink in size as needed. This README provides examples and explanations of using `Vector` in Java.

## Table of Contents

1. Introduction
2. Basic Usage
3. Declaring Vectors
4. Common Methods
5. Examples
6. Additional Notes

## Introduction

The `java.util.Vector` class allows you to work with dynamic arrays in Java. Unlike regular arrays, `Vector` can resize itself automatically as elements are added or removed. This makes it convenient for situations where you need a flexible data structure that can handle varying amounts of data.

## Basic Usage

Vectors in Java behave similar to arrays but provide more flexibility:

- **Dynamic Size**: Vectors can grow or shrink dynamically based on the number of elements they hold.
- **Element Access**: Elements in a vector are accessed using zero-based indexing, just like arrays.
- **Heterogeneous Elements**: Vectors can store elements of different types (`String`, `Integer`, `Float`, etc.) in the same instance.

## Declaring Vectors

You can declare vectors in Java with or without an initial capacity:

```java
// Without initial size
Vector<Object> v = new Vector<>();

// With initial size
Vector<Object> v = new Vector<>(6);
```

In the first example, `v` is declared as a `Vector` that can hold objects of any type. The second example initializes `v` with an initial capacity of 6 elements.

## Common Methods

Here are some commonly used methods of the `Vector` class:

- `add(item)`: Adds an item to the end of the vector.
- `get(index)`: Retrieves the element at the specified index.
- `addElement(item)`: Adds an item to the end of the vector (deprecated, use `add(item)` instead).
- `elementAt(index)`: Retrieves the element at the given index.
- `size()`: Returns the current number of elements in the vector.
- `removeElement(item)`: Removes the first occurrence of the specified item from the vector.
- `removeElementAt(index)`: Removes the element at the specified index.
- `insertElementAt(item, index)`: Inserts an item at the specified index, shifting subsequent elements to the right.
- `removeAllElements()`: Removes all elements from the vector.

## Examples

### Example 1: Adding elements to a vector

```java
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        v.add("This ");
        v.add("year ");
        v.add("is ");
        v.add(':');
        v.add(2020);
        System.out.println(v); // Output: [This , year , is , :, 2020]
    }
}
```

In this example, a `Vector` is created to store various types of objects (`String` and `Integer`). Elements are added sequentially using the `add()` method, and the entire vector is printed to demonstrate its contents.

### Example 2: Iterating through a vector

```java
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        for (int j = 0; j < v.size(); j++) {
            System.out.println(v.get(j));
        }
    }
}
```

Here, integers from 0 to 9 are added to a `Vector` and then retrieved using a loop. The `size()` method is used to determine the number of elements in the vector, and `get(index)` retrieves each element by index.

### Example 3: Manipulating a vector

```java
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vec.add(i);
        }
        
        System.out.println(vec); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        
        System.out.println(vec.get(2)); // Output: 2
        System.out.println(vec.elementAt(2)); // Output: 2
        
        vec.addElement(50);
        vec.insertElementAt(100, 3);
        vec.removeElement(7);
        vec.removeElementAt(1);
        
        System.out.println(vec); // Output: [0, 100, 2, 3, 4, 5, 6, 8, 9, 50]
    }
}
```

This example demonstrates various operations on a `Vector` of integers. Elements are added (`addElement()` and `insertElementAt()`), removed (`removeElement()` and `removeElementAt()`), and accessed (`get()` and `elementAt()`).

## Additional Notes

- **Thread Safety**: Unlike `ArrayList`, `Vector` is synchronized, meaning it is safe for concurrent use by multiple threads. However, this synchronization overhead can impact performance.
- **Performance**: Consider using `ArrayList` instead of `Vector` if thread safety is not required, as `ArrayList` generally offers better performance in single-threaded scenarios.

---


