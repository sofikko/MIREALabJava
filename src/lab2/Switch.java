package lab2;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Switch obj = new Switch();

        System.out.print("Enter the words separated by a space: ");
        Scanner sc = new Scanner(System.in);
        StringTokenizer token = new StringTokenizer(sc.nextLine());
        int size = token.countTokens();
        String[] mass = new String[size];
        for (int i = 0; i < size; mass[i] = token.nextToken(), i++){}

        obj.swap(size, mass);
        System.out.print("You swap words: " + size);
        for (int i = 0; i < size; System.out.print(" " + mass[i]), i++){}
    }

    public void swap(int size, String[] mass){
        for (int i = 0; i < size/2; i++){
            String temp = mass[size-i-1];
            mass[size-i-1] = mass[i];
            mass[i] = temp;
        }
    }

}
