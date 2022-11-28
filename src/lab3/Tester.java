package lab3;

import lab2.Circle.Circle;

import java.util.Scanner;


public class Tester {

    Circle[] array;
    int size;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hom many number you want: ");
        Tester obj = new Tester();
        obj.size = sc.nextInt();
        obj.array = new Circle[obj.size];
        for (int i = 0; i < obj.size; i++)
            obj.array[i] = new Circle(Math.random()*100, Math.random()*100, Math.random()*100);
        System.out.println("Your circles: ");
        for (int i = 0; i < obj.size; i++)
            System.out.println('\t' + obj.array[i].toString());

        System.out.println("Too Smaller circle: " + obj.small().toString());
        System.out.println("Biggest circle: " + obj.big().toString());
        obj.sort();

        System.out.println("Your circles: ");
        for (int i = 0; i < obj.size; i++)
            System.out.println('\t' + obj.array[i].toString());
    }

    public Circle big(){
        Circle temp = array[0];
        for(int i = 1; i < size; i++)
            if (temp.compare(array[i]) < 0)
                temp = array[i];
        return temp;
    }
    public Circle small(){
        Circle temp = array[0];
        for(int i = 1; i < size; i++)
            if (temp.compare(array[i]) > 0)
                temp = array[i];
        return temp;
    }
    public void sort(){
        for(int i = size - 1; i > 0; i--)
            for(int j = 0; j < i; j++)
                if (array[j].compare(array[j + 1]) > 0) {
                    Circle temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }


    }
}
