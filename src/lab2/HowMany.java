package lab2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter words separeted by a space: ");
        StringTokenizer line = new StringTokenizer(scan.nextLine()); //Запись в класс строки с потока ввода
        System.out.println("Кол-во элементов: " + line.countTokens()); //countTokens - кол-во слов в строке line
    }
}
