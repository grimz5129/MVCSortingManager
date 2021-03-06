# MVC Sorting Manager
This is a Java program that provides a command line based interface to allow a user to select a sorting algorithm and sort either a array or a array list.

## Sorting Algorthims

- Bubble Sort
- Quick Sort
- Java Collection/Array Sort
- Tree Sort

### Console View

![choose algo](SortingMVC/src/main/resources/images/algo.png)

The user can enter one of the displayed algorithms. 

If the user enters an incorrect value the program will restart.

![choose type](SortingMVC/src/main/resources/images/type.png)

The program will ask the user to enter if they want to sort an array or array list.

![output](SortingMVC/src/main/resources/images/output.png)

The program will display the randomly generated array/array list.

The sorting algorithm is applied to the unsorted array and displayed in the console.

The time of the chosen sorting method is also displayed which can be used to compare the the sorting algorithms.

<img src="SortingMVC/src/main/resources/images/continue.png" alt="continue" style="zoom:50%;" />

After the sorting algorithm has run the user can exit or continue running the program.

### The application uses logging

The application uses log4j to record the users action and store the messages in a log file.
