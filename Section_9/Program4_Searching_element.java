package Section_9;

import java.util.Scanner;

public class Program4_Searching_element {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the total number of element in the array : ");
        int element = sc.nextInt();

        int[] arr = new int[element];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Please enter the " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("\nPlease enter the number you want to check : ");
        int number = sc.nextInt();

        int a = 0;
        i = 0;
        while (i < arr.length) {
            if (number == arr[i]) {
                a++;
            }
            i++;
        }

        if (a > 0) {
            System.out.print("The index is at index : ");
            i = 0;
            while (i < arr.length) {
                if (number == arr[i]) {
                    System.out.print((i + 1) + " ");
                }
                i++;
            }
        } else {
            System.out.println("\nThe number is not at any index in this array ");
        }
        sc.close();
    }
}