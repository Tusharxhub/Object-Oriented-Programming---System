//! Write a Java program to define a class Sortarray with two member variables: an array of integers and an integer type size. Initialize the variables using a constructor. Define a sort method to sort the array in ascending order using bubble sort. Handle any exceptions that occur using try-catch. Define a show method to print the sorted array.

public class Sortarray {
    int[] arr;
    int size;

    Sortarray(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public void sort() {
        try {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred");
        }
    }

    public void show() {
        System.out.println("Sorted array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        Sortarray s = new Sortarray(arr, arr.length);
        s.sort();
        s.show();
    }
}
