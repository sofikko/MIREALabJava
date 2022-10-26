package lab1;

import java.util.Scanner;
import java.util.StringTokenizer; //класс разбиения строки текста на слова

public class task4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целочисленные элементы через пробел: ");
        StringTokenizer line = new StringTokenizer(scan.nextLine()); //Запись в класс строки с потока ввода
        int sum = 0, min = 0, max = 0, size = line.countTokens(); //countTokens - кол-во слов в строке line
        int array[] = new int[size];
        int i = 0;
        while(i < size){
            array[i] = Integer.parseInt(line.nextToken()); //parseInt - строка в число, nextToken - перебор слов в строке
            sum += array[i];
            if (array[min] > array[i])
                min = i;
            else if (array[max] < array[i])
                max = i;
            i++;
        }
        System.out.println("Кол-во элементов: " + size
                + "\nСумма элементов: " + sum
                + "\nНаименьший элемент: arrray[" + (min+1) + "]=" + array[min]
                + "\nНаибольший элемент: arrray[" + (max+1) + "]=" + array[max]);
    }
}
