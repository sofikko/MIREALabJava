package theory;

import java.util.Scanner;

public class theory {

    /*При запуске Джава программы выполнение начнётся с метода main(),
     который обязательно должен быть в классе, с которого будет начинаться запуск программы*/
    public static void main(String[] args) { //args - аргументы командной строки

        //объявление переменных
        int num_i = 7; //long(8), int(4), short(2), byte(1) (-128;127)
        double num_d = 3.5;
        float num_f = 45.67f;

        //массивы
        int[] arr = new int[10];

        Scanner scan = new Scanner(System.in); //Создание объекта sc класса Scanner, указав, с каким потоком ввода он будет связан
        System.out.print("Введите целое число: ");
        if (scan.hasNextInt()) {
            int size = scan.nextInt(); //Считывание с потока ввода
            System.out.println("Вы ввели: " + size);
        } else {
            System.err.println("Вы ввели не целое число!");
        }
    }

}
