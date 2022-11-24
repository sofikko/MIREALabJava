import lab1.TaskTester1;
import lab2.TaskTester2;

import java.util.Scanner;

public class TasksTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lab;
        do {
            System.out.print("\n\n(For exite tap 0 on your keyboard)\n\tEnter lab's number: ");
            lab = sc.nextInt();
            switch (lab) {
                case 1:
                    System.out.println("You are in lab 1.");
                    TaskTester1.main(args);
                    break;
                case 2:
                    System.out.println("You are in lab 2.");
                    TaskTester2.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Incorrect number. Try again.");
            }
        }
        while(lab != 0);
    }
}
