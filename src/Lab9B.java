//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab9B {
    public static void bubbleSort(int[] array1) {
        int n = array1.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                //check if last number is higher
                if (array1[j-1] > array1[j]) {
                    //swap elements
                    temp = array1[j-1];
                    array1[j-1] = array1[j];
                    array1[j] = temp;
                }
            }
        }
    }
    public static void binarySearch(int[] array1, int low, int high, int key) {
        int mid = (low + high) / 2;
        while (low <= high) {
            System.out.println("Low is " + low + "\nHigh is " + high + "\nMid is " + mid + "\nSearching");
            if (array1[mid] < key) {
                low = mid + 1;
            }
            else if (array1[mid] == key) {
                System.out.println("The target is in the set.");
                break;
            }
            else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("The target is not in the set.");
        }
    }
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int[] array1;
        int intKey;
        array1 = new int[11];


        //initial output and loop to get variables
        System.out.println("Please enter 11 numbers:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            array1[i] = scan.nextInt();
        }

        //second output and get target
        System.out.print("What is the target number: ");
        intKey = scan.nextInt();

        //sort and print sorted list
        bubbleSort(array1);
        System.out.print("The sorted set is: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");

        //binary search and repeated variable printing
        binarySearch (array1, 0, 10, intKey);

    }
}