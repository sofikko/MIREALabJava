package lab1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1 || num >=  40) {
            if (num < 1) System.out.print("Your number is too small.");
            else System.out.print("Please, enter less number.");
        }
        else {
            System.out.print("Your factorial = " + fact(num));
        }
    }

    private static long fact(int num){
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        return fact;
    }
}
