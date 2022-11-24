package lab2.Ball;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ball obj;
        double x, y;
        System.out.print("Do you want to enter personal coordinates for the Ball?\n\t" +
                "Enter 'y' to yes and some else to no.\n\tYour answer:\t");
        if (sc.next().charAt(0) == 'y') {
            System.out.print("Enter x: ");
            x = sc.nextDouble();
            System.out.print("Enter y: ");
            y = sc.nextDouble();
            obj = new Ball(x, y);
        } else {
            obj = new Ball();
        }

        char answer;
        while(true) {
            System.out.print("\nDo you want see or edit information?" +
                    "\t(Tap 'e' to edit, 's' to see and some else to exit)\n" +
                    "\tEnter your choice: ");
            answer = sc.next().charAt(0);
            if (answer != 's' && answer != 'e') break;
            switch(answer){
                case 'e':
                    System.out.print("What do you want edit?" +
                            "\t(Tap 'a' for edit all, 'x'- x coordinates, 'y'- y coordinates and  'm' to move ball)\n" +
                            "\tEnter your choice: ");
                    answer = sc.next().charAt(0);
                    switch(answer){
                        case 'a':
                            System.out.print("Enter x and y: ");
                            obj.setXY(sc.nextDouble(), sc.nextDouble());
                            break;
                        case 'x':
                            System.out.println("Enter x coordinates:  ");
                            obj.setX(sc.nextDouble());
                            break;
                        case 'y':
                            System.out.println("Enter y coordinates: ");
                            obj.setY(sc.nextDouble());
                            break;
                        case 'm':
                            System.out.print("Enter moving along x and y: ");
                            obj.move(sc.nextDouble(), sc.nextDouble());
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
                case 's':
                    System.out.print("What do you want see?" +
                            "\t(Tap 'a' to see all, 'x'- x coordinates, 'y'- y coordinates)\n" +
                            "\tEnter your choice: ");
                    answer = sc.next().charAt(0);
                    switch(answer){
                        case 'a':
                            System.out.println(obj.toString());
                            break;
                        case 'x':
                            System.out.println("Ball's x coordinates = " + obj.getX());
                            break;
                        case 'y':
                            System.out.println("Ball's y coordinates = " + obj.getY());
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
            }
        }

    }
}
