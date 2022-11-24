package lab2.Book;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Create book:");
        Book obj;
        obj = new Book();
        System.out.print("\tEnter name: ");
        obj.setName(sc.nextLine());
        System.out.print("\tEnter author: ");
        obj.setAuthor(sc.nextLine());
        System.out.print("\tEnter publication year ans number: ");
        obj.setYear(sc.nextInt());
        obj.setPublication(sc.nextInt());
        sc.nextLine();

        String answer;
        while (true) {
            System.out.print("\nDo you want see or edit information?" +
                    "\t(Tap 'e' to edit, 's' to see and some else to exit)\n" +
                    "\tEnter your choice: ");
            answer = sc.nextLine();
            if (answer.charAt(0) != 's' && answer.charAt(0) != 'e') break;
            switch (answer.charAt(0)) {
                case 'e':
                    System.out.print("What do you want edit?" +
                            "\t(Tap 'n' for edit name, 'a'- author, 'y'- year and  'p'- publication)\n" +
                            "\tEnter your choice: ");
                    answer = sc.nextLine();
                    switch (answer.charAt(0)) {
                        case 'n':
                            System.out.print("Enter new name:  ");
                            obj.setName(sc.nextLine());
                            break;
                        case 'a':
                            System.out.print("Enter new author: ");
                            obj.setAuthor(sc.nextLine());
                            break;
                        case 'y':
                            System.out.print("Enter new year: ");
                            obj.setYear(Integer.parseInt(sc.nextLine()));
                            break;
                        case 'p':
                            System.out.print("Enter new publication: ");
                            obj.setPublication(Integer.parseInt(sc.nextLine()));
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
                case 's':
                    System.out.print("What do you want see?" +
                            "\t(Tap 'a' for watch all, 'n'- name, 'u'- author, 'y'- year and  'p'- publication)\n" +
                            "\tEnter your choice: ");
                    answer = sc.nextLine();
                    switch (answer.charAt(0)) {
                        case 'a':
                            System.out.println(obj.toString());
                            break;
                        case 'n':
                            System.out.println(obj.getName());
                            break;
                        case 'u':
                            System.out.println(obj.getAuthor());
                            break;
                        case 'y':
                            System.out.println(obj.getYear());
                            break;
                        case 'p':
                            System.out.println(obj.getPublication());
                            break;
                        default:
                            System.out.println("Your choice incorrect.");
                            break;
                    }
                    break;
            }
        }

        Book o1 = new Book("Homo Deus", "Юваль Ной Харари", 2015, 9),
                o2 = new Book("Империя должна умереть", "Михаил Зыгарь", 2017, 2),
                o3 = new Book("Автографическая проза Пушкина", "Пушкин", 1989, 2),
                o4 = new Book ("Рудин. Дворянское гнездо.", "И.С.Тургенев", 1963, 2),
                o5 = new Book("Преступление и наказание", "Ф.М. Достоевский", 1957, 1),
                o6 = new Book("Красота физики", "Фрэнк Вильчек", 2017, 2),
                o7 = new Book("Новый самоучитель английского языка", "А.В. Петрова, И.А. Орлова", 2018, 9),
                o8 = new Book("Physics of the impossible", "Micho Kaku", 2017, 9);
        Book[] b = {o1, o2, o3, o4, o5, o6, o7, o8};
        bookshelf shelf = new bookshelf(b, 8);
        shelf.show();
        System.out.println("Early book: " + shelf.early().toString());
        System.out.println("Later book: " + shelf.later().toString());
        System.out.println("\nThen sort books.");
        shelf.sort();
        shelf.show();

    }
}
