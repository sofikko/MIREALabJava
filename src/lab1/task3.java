package lab1;

import java.util.Scanner;

public class task3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); //Создание объекта sc класса Scanner, указав, с каким потоком ввода он будет связан
        System.out.print("Введите целое число: ");
        int size = sc.nextInt(); //Считывание с потока ввода
        System.out.println("Вы ввели: " + size);

    }
}
