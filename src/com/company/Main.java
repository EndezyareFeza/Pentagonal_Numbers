package com.company;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of pentagonals to be calculated: ");

        int numbers = input.nextInt();
        int pentNum = 0;
        int n = 1;

        System.out.println("The pentagonal numbers from 1 to " + numbers + " are: ");

        while(n <= numbers){
            pentNum = (n * ((3 * n) - 1) / 2);
            System.out.print(pentNum + " ");
            if(n % 10 == 0)
                System.out.println(" ");
            n++;
        }
    }
}

/*
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit for calculation: ");
        int limit = input.nextInt();
        System.out.print("Pentagonal numbers from 1 to " + limit + " are: " + getPentNumbers(limit));
    }
    public static int getPentNumbers(int limit) {
        int pentagonal =0;
        for (int n = 1; n <= limit; n++) {
            pentagonal = (n * ((3 * n) - 1) / 2);
            System.out.print(pentagonal + " ");
            if(n % 10 == 0)
                System.out.println(" ");
        }
        return pentagonal;
    }
}
*/
