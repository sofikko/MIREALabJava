package lab2.Pound;

import lab2.Circle.Circle;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Pound {
    private List<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pound pound = new Pound();

        String answer;
        int index;
        while (true) {
            System.out.print("\nYou have " + pound.dogs.size() + " dogs in pound.\n");
            System.out.print("\nDo you want see or edit information?" +
                    "\t(Tap 'e' to edit, 's' to see and some else to exit)\n" +
                    "\tEnter your choice: ");
            answer = sc.nextLine();
            if (answer.charAt(0) != 's' && answer.charAt(0) != 'e') break;
            switch(answer.charAt(0)){
                case 'e':
                    System.out.print("What do you want edit?" +
                            "\t(Tap 'a' for add dog, 'n' for edit name, 'e'- for edit age)\n" +
                            "\tEnter your choice: ");
                    answer = sc.nextLine();
                    switch(answer.charAt(0)){
                        case 'a':
                            System.out.print("Enter name: ");
                            answer = sc.nextLine();
                            System.out.print("Enter age: ");
                            pound.dogs.add(new Dog(Integer.parseInt(sc.nextLine()), answer));
                            break;
                        case 'n':
                            System.out.print("Enter dog's number: ");
                            index = Integer.parseInt(sc.nextLine()) - 1;
                            if (index < 0 || index >= pound.dogs.size())
                                System.out.println("Incorrect number.");
                            else {
                                System.out.print("Enter new name: ");
                                pound.dogs.get(index).setName(sc.nextLine());
                            }
                            break;
                        case 'e':
                            System.out.print("Enter dog's number: ");
                            index = Integer.parseInt(sc.nextLine()) - 1;
                            if (index < 0 || index >= pound.dogs.size())
                                System.out.println("Incorrect number.");
                            else {
                                System.out.print("Enter new age: ");
                                pound.dogs.get(index).setAge(Integer.parseInt(sc.nextLine()));
                            }
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
                case 's':
                    System.out.print("What do you want see?" +
                            "\t(Tap 'a' to see all, 'o'- to see one dog by number.)\n" +
                            "\tEnter your choice: ");
                    answer = sc.nextLine();
                    switch(answer.charAt(0)){
                        case 'a':
                            if (pound.dogs.size() == 0)
                                System.out.println("You have no dog in pound.");
                            else
                                System.out.println(pound.toString());
                            break;
                        case 'o':
                            System.out.print("\tEnter dog's number: ");
                            index = Integer.parseInt(sc.nextLine()) - 1;
                            if (index >= 0 & index < pound.dogs.size())
                                System.out.println(pound.dogs.get(index).toString());
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

    public void add(int age, String name){
        dogs.add(new Dog(age, name));
    }

    @Override
    public String toString() {
        String answ = "Welcome to the pound:";
        for (int i = 0; i < dogs.size(); i++)
            answ = answ + "\n\t" + (i + 1) + ": " + dogs.get(i).toString();
        return answ;
    }
}
