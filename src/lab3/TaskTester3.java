package lab3;

import java.util.Scanner;
import java.util.Random;

public class TaskTester3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int task, count;
        do {
            System.out.print("\n\n(For exite tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter hom many number you want: ");
                    count = sc.nextInt();
                    System.out.println("You first numbers:");
                    double[] mass1 = new double[count];
                    double[] mass2 = new double[count];
                    for (int i = 0; i < count; i++){
                        mass1[i] = Math.random();
                        System.out.print("\t" + mass1[i]);
                    }
                    System.out.println("\nYou second numbers:");
                    Random rand = new Random();
                    for (int i = 0; i < count; i++){
                        mass2[i] = rand.nextDouble();
                        System.out.print("\t" + mass2[i]);
                    }
                    break;
                case 2:
                    System.out.print("\nThe Tester class has been created, test the class.\n");
                    Tester.main(args);
                    break;
                case 3:
                    int size = 4;
                    int[] array3 = new int[size];
                    System.out.println("Your array is:");
                    for(int i = 0; i < size; i++) {
                        array3[i] = (int)(Math.random()*100);
                        System.out.print("\t" + array3[i]);
                    }
                    System.out.println("");
                    boolean f = true;
                    for(int i = 0; i < size - 1; i++)
                        if (array3[i] >= array3[i + 1])
                            f = false;
                    if (f)
                        System.out.println("This is an increasing sequence.");
                    else
                        System.out.println("Non");
                    break;
                case 4:
                    int count1, count2 = 0;
                    while(true){
                        System.out.print("Enter number's count: ");
                        count1 = sc.nextInt();
                        if (count1 <= 0)
                            System.out.println("This is too small count. Repeat enter.");
                        else
                            break;
                    }
                    int[] array4 = new int[count1];
                    System.out.println("Your first array: ");
                    for (int i = 0; i < count1; i++) {
                        array4[i] = (int) (Math.random() * count1);
                        System.out.print("\t" + array4[i]);
                        if (array4[i] % 2 == 0)
                            count2++;
                    }
                    System.out.println("\n\nYour second array: ");
                    int[] array4_2 = new int[count2];
                    for (int i = 0; i < count1; i++) {
                        if (array4[i] % 2 == 0) {
                            array4_2[count2-1] = array4[i];
                            count2--;
                            System.out.print("\t" + array4[i]);
                        }
                    }
                    break;
                    /*
                case 5:
                    break;
                case 6:
                    System.out.println("\nIt's the same class as classes 4 and 5, and ... Test other classes.\n");
                    break;
                case 7:
                    System.out.print("\nThe BookTest class has been created, test the class.\n");
                    BookTest.main(args);
                    break;
                case 8:
                    System.out.print("\nThe Switch class has been created, test the class.\n");
                    Switch.main(args);
                    break;
                case 9:
                    System.out.print("\nThe Poker class has been created, test the class.\n");
                    Poker.main(args);
                    break;

                     */
                default:
                    System.out.print("There is no such task.");
            }
        }
        while(task != 0);
    }
}
