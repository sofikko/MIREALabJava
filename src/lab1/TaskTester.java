package lab1;

import java.util.Scanner;

public class TaskTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int task;
        do {
            System.out.print("\n\n(For exite tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 1:
                    System.out.println("Создан текущий проект MIREALabJava в IntelliJ IDEA.");
                    break;
                case 2:
                    System.out.println("Создан репозиторий Git, подключён к текущему проекту.");
                    break;
                case 3:
                    System.out.print("Текущее задание выполнено путём созадния класса task3, вот результат его запуска:\n\n");
                    task3.main(args);
                    break;
                case 4:
                    System.out.print("Текущее задание выполнено путём созадния класса task4, вот результат его запуска:\n\n");
                    task4.main(args);
                    break;
                case 5:
                    System.out.print("Текущее задание выполнено путём созадния класса task5," +
                            "\n\t вот результат его запуска с передечай в качестве аргументов слов \"This\" \"is\" \"5\":\n\n");
                    String[] arguments = {"This", "is", "5"};
                    task5.main(arguments);
                    break;
                case 6:
                    System.out.print("Текущее задание выполнено путём созадния класса task6, вот результат его запуска:\n\n");
                    task6.main(args);
                    break;
                case 7:
                    System.out.print("Текущее задание выполнено путём созадния класса task7, вот результат его запуска:\n\n");
                    task7.main(args);
                    break;
                case 8:
                    System.out.println("Через IDE текущий проект был залит  в репозиторий GitHub.");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("В текущей практической нет такого задания, введите номер от 1 до 8 включительно.");
            }
        }
        while(task != 0);
    }
}
