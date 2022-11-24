package lab2.Circle;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    private int size = 0;
    private ArrayList<Circle> circles = new ArrayList<Circle>();

    public static void main(String[] args){

        Tester obj = new Tester();

        Scanner sc = new Scanner(System.in);
        char answer;
        while(true) {
            System.out.print("\nYou have " + obj.size + " circles in tester object.\n");
            System.out.print("\nDo you want see or edit information?" +
                    "\t(Tap 'e' to edit, 's' to see and some else to exit)\n" +
                    "\tEnter your choice: ");
            answer = sc.next().charAt(0);
            if (answer != 's' && answer != 'e') break;
            int index;
            switch(answer){
                case 'e':
                    System.out.print("What do you want edit?" +
                            "\t(Tap 's' for edit size, 'x'- x coordinates, 'y'- y coordinates and  'r'- radius)\n" +
                            "\tEnter your choice: ");
                    answer = sc.next().charAt(0);
                    switch(answer){
                        case 's':
                            System.out.print("\tEnter new size ");
                            int new_size = sc.nextInt();
                            if (new_size >= obj.size){
                                for(; new_size > obj.size; obj.size++){
                                    System.out.print("\tEnter x, y - coordinates and radius for " +
                                            (obj.size+1) + " circle: ");
                                    obj.circles.add(new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                                }
                            }
                            else{
                                for(; obj.size > new_size; obj.size--)
                                    obj.circles.remove(obj.size - 1);
                            }
                            break;
                        case 'x':
                            System.out.println("\tEnter number circle and new x coordinates:  ");
                            index = sc.nextInt() -1;
                            double new_x = sc.nextDouble();
                            if (index >= 0 & index < obj.size)
                                obj.circles.get(index).setX(new_x);
                            else
                                System.out.println("Incorrect number.");
                            break;
                        case 'y':
                            System.out.println("\tEnter number circle and new y coordinates:  ");
                            index = sc.nextInt() -1;
                            double new_y = sc.nextDouble();
                            if (index >= 0 & index < obj.size)
                                obj.circles.get(index).setY(new_y);
                            else
                                System.out.println("Incorrect number.");
                            break;
                        case 'r':
                            System.out.print("\tEnter number circle and new radius: ");
                            index = sc.nextInt() -1;
                            double new_rad = sc.nextDouble();
                            if (index >= 0 & index < obj.size)
                                obj.circles.get(index).setRadius(new_rad);
                            else
                                System.out.println("Incorrect number.");
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
                case 's':
                    System.out.print("What do you want see?" +
                            "\t(Tap 'a' to see all, 'o'- to see one circle by number.)\n" +
                            "\tEnter your choice: ");
                    answer = sc.next().charAt(0);
                    switch(answer){
                        case 'a':
                            System.out.println(obj.toString());
                            break;
                        case 'o':
                            System.out.print("\tEnter number circle: ");
                            index = sc.nextInt() -1;
                            if (index >= 0 & index < obj.size)
                                System.out.println(obj.circles.get(index).toString());
                            else
                                System.out.println("Incorrect number.");
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
            }
        }
    }

    public String toString(){
        if (size == 0)
            return "0 objects.";
        String str = "";
        for(int i = 0; i < size; i++) {
            str += "Num " + (i + 1) + ": " + circles.get(i).toString() + "\t";
            if ((i+1)%3 == 0)
                str += "\n";
        }
        return str + ".";
    }
}
