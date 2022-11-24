package lab2;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Random;

public class Poker {
    public static void main(String[] args) {

        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
        String[] suit = {"Diamond", "Hearts", "Clubs", "Spades"};
        ArrayList<String> cards = new ArrayList<String>();
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++)
                cards.add(values[i] + " " + suit[j]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count people: ");
        int count = sc.nextInt();

        int index;
        for (int i = 0; i < count; i++){
            System.out.print("\nCard for " + (i+1) + " person: \n");
            for (int j = 0; j < 5; j++){
                index = (int)(Math.random()*cards.size());
                System.out.print("     " + cards.get(index));
                cards.remove(index);
            }
        }
    }
}
