package lab1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        System.out.print("Enter number count: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("First " + count + " harmonic numbers:");
        for(int i = 1; i <= count; i++)
            System.out.printf(i + " number: %.3f\n", (float)1/i);
    }
}
