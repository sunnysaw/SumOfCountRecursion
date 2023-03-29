/*
Question : Write a program to return the count of digits in a given number.
_______________________________________________________________________________
Test case :
I/O = 5483
O/P = 4
 */

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    // Using recursion.
    static int CountOfNumber(int number){
        if (number >= 0 && number <= 9)return 1;
        return CountOfNumber(number / 10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,count = 0,temp;
        // Without using recursion.
        System.out.println("Enter the number :");
        number = sc.nextInt();
        temp = number;
        while (number > 0){
            number = number / 10;
            count++;
        }
        System.out.println("Printing the result without using recursion :");
        System.out.println(count);
        System.out.println("Printing the result using recursion :");
        System.out.println(CountOfNumber(temp));
    }
}