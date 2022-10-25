//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab9A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int[] array1;
        int intTarget;
        array1 = new int[10];


        //initial output and loop to get variables
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            array1[i] = scan.nextInt();
        }

        //second output and get target
        System.out.print("What is the target number: ");
        intTarget = scan.nextInt();

        //linear search
        for (int i = 0; i < 10; i++) {
            if (intTarget == array1[i]) {
                System.out.println("The target is in the set.");
                break;
            }
            else if (i == 9) {
                System.out.println("The target is not in the set.");
                break;
            }
        }

    }
}