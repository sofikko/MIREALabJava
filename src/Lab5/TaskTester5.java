package Lab5;

import Lab5.Gifka.Main;
import Lab5.Match.*;

import java.util.Scanner;

public class TaskTester5 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int task;
        TaskTester5 tester = new TaskTester5();
        do {
            System.out.print("\n\nYou are in Tester 5.\n(To move on the next section tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 0:
                    break;
                case 1:
                    System.out.print("\nYou are in Gifka.\n");
                    Lab5.Gifka.Main.main(args);
                    break;
                case 2:
                    System.out.print("\nYou are in Match.\n");
                    Lab5.Match.Main.main(args);
                    break;
                case 3:
                    System.out.print("\nYou are in OpenImage.\n");
                    Lab5.OpenImage.Main.main(args);
                    break;
                case 4:
                    System.out.print("\nYou are in Shapes.\n");
                    Lab5.Shapes.Main.main(args);
                    break;
                default:
                    System.out.print("There is no such task.");
            }
        } while (task != 0);
    }
}
