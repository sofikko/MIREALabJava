package lab2.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name, email; char gender;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter gender (f-female, m-male): ");
        gender = sc.next().charAt(0);
        System.out.print("Enter email: ");
        email = sc.next();

        Author obj = new Author(name, email, gender);

        char answer;
        while(true) {
            System.out.print("\nDo you want see or edit information?" +
                    "\t(Tap 'e' for edit, 's' for see and some else for exit)\n" +
                    "\tEnter your choice: ");
            answer = sc.next().charAt(0);
            if (answer != 's' && answer != 'e') break;
            switch(answer){
                case 'e':
                    System.out.print("\tYou can edit only email. Enter new email: ");
                    obj.setEmail(sc.next());
                    break;
                case 's':
                    System.out.print("What do you want see?" +
                            "\t(Tap 'a' for see all, 'n'-name, 'g'-gender and 'e'-email)\n" +
                            "\tEnter your choice: ");
                    answer = sc.next().charAt(0);
                    switch(answer){
                        case 'a':
                            System.out.println(obj.toString());
                            break;
                        case 'n':
                            System.out.println("Author's name is " + obj.getName());
                            break;
                        case 'g':
                            System.out.println("Author is " + obj.getGender() + "\t(f-female, m-male, t-transgender)");
                            break;
                        case 'e':
                            System.out.println("Authot's email: " + obj.getEmail());
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
