package lab2;

import lab1.*;
import lab2.Author.TestAuthor;
import lab2.Ball.*;
import lab2.Book.BookTest;
import lab2.Circle.Tester;
import lab2.Shop.TestShop;
import lab2.Pound.Pound;

import java.util.Scanner;

public class TaskTester2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int task;
        do {
            System.out.print("\n\n(For exite tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 0:
                    break;
                case 1:
                    System.out.print("\nThe Author class has been created, test the class.\n");
                    TestAuthor.main(args);
                    break;
                case 2:
                    System.out.print("\nThe Ball class has been created, test the class.\n");
                    TestBall.main(args);
                    break;
                case 3:
                    System.out.print("\nThe Tester class has been created, test the class.\n");
                    Tester.main(args);
                    break;
                case 4:
                    System.out.print("\nThe Shop class has been created, test the class.\n");
                    TestShop.main(args);
                    break;
                case 5:
                    System.out.print("\nThe Pound class has been created, test the class.\n");
                    Pound.main(args);
                    break;
                case 6:
                    System.out.println("\nIt's the same class as classes 4 and 5, and ... Test other classes.\n");
                    break;
                case 7:
                    System.out.print("\nThe BookTest class has been created, test the class.\n");
                    BookTest.main(args);
                    break;
                case 8:
                    System.out.print("\nThe Switch class has been created, test the class.\n");
                    Switch.main(args);
                    break;
                case 9:
                    System.out.print("\nThe Poker class has been created, test the class.\n");
                    Poker.main(args);
                    break;
                default:
                    System.out.print("There is no such task.");
            }
        }
        while(task != 0);
    }
}
