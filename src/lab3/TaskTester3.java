package lab3;

import java.util.*;
import java.text.*;
import java.util.List;
import java.util.ArrayList;

public class TaskTester3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task;
        TaskTester3 tester = new TaskTester3();
        do {
            System.out.print("\n\nYou are in Tester Math and Random.\n(To move on the next section tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 0:
                    break;
                case 1:
                    tester.Math_Random_1();
                    break;
                case 2:
                    System.out.print("\nThe Tester class has been created, test the class.\n");
                    Tester.main(args);
                    break;
                case 3:
                    tester.Math_Random_3();
                    break;
                case 4:
                    tester.Math_Random_4();
                    break;
                default:
                    System.out.print("There is no such task.");
            }
        }
        while (task != 0);
        do {
            System.out.print("\n\nYou are in Shells.\n(To move on the next section tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 0:
                    break;
                case 1:
                    tester.shells_1();
                    break;
                case 2:
                    tester.shells_2();
                    break;
                default:
                    System.out.print("There is no such task.");

            }
        }
        while (task != 0);
        do {
            System.out.print("\n\nYou are in Formater.\n(To move on the next section tap 0 on your keyboard)\n\tEnter task's number: ");
            task = sc.nextInt();
            switch (task) {
                case 0:
                    break;
                case 1:
                    tester.formater_1();
                    break;
                case 2:
                    tester.formater_2();
                    break;
                default:
                    System.out.print("There is no such task.");

            }
        }
        while (task != 0);
    }

    private int Math_Random_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hom many number you want: ");
        int count = sc.nextInt();
        System.out.println("You first numbers:");
        double[] mass1 = new double[count];
        double[] mass2 = new double[count];
        for (int i = 0; i < count; i++) {
            mass1[i] = Math.random();
            System.out.print("\t" + mass1[i]);
        }
        System.out.println("\nYou second numbers:");
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            mass2[i] = rand.nextDouble();
            System.out.print("\t" + mass2[i]);
        }
        return 0;
    }

    private int Math_Random_3(){
        int size = 4;
        int[] array3 = new int[size];
        System.out.println("Your array is:");
        for (int i = 0; i < size; i++) {
            array3[i] = (int) (Math.random() * 100);
            System.out.print("\t" + array3[i]);
        }
        System.out.println("");
        boolean f = true;
        for (int i = 0; i < size - 1; i++)
            if (array3[i] >= array3[i + 1])
                f = false;
        if (f)
            System.out.println("This is an increasing sequence.");
        else
            System.out.println("Non");
        return 0;
    }

    private int Math_Random_4(){
        Scanner sc = new Scanner(System.in);
        int count1, count2 = 0;
        while (true) {
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
        if (count2 < 1)
            System.out.println("We haven't find number for second array.");
        else {
            System.out.println("\n\nYour second array: ");
            int[] array4_2 = new int[count2];
            for (int i = 0; i < count1; i++) {
                if (array4[i] % 2 == 0) {
                    array4_2[count2 - 1] = array4[i];
                    count2--;
                    System.out.print("\t" + array4[i]);
                }
            }
        }
        return 0;
    }

    private int shells_1(){
        System.out.println("Task 1");
        byte by = 25;
        boolean bo = true;
        short s = 1234;
        int i = 15;
        long l = 456868;
        float f = 6.98f;
        double d = 34.671;
        char c = 'u';
        System.out.println("Numbers:" +
                "\tbyte = " + by +
                "\tshort = " + s +
                "\tint = " + i +
                "\tlong = " + l +
                "\tfloat = " + f +
                "\tdouble = " + d +
                "\tchar = " + c);
        System.out.println("Double numbers:" +
                '\t' + Double.valueOf(by) +
                '\t' + Double.valueOf(s) +
                '\t' + Double.valueOf(i) +
                '\t' + Double.valueOf(l) +
                '\t' + Double.valueOf(f) +
                '\t' + Double.valueOf(d) +
                '\t' + Double.valueOf(c) +
                '\t' + (bo == true ? 1 : 0));
        System.out.println("Task 2");
        String st = "3456.678";
        System.out.println("String with Double.parseDouble(): " +
                Double.parseDouble(st));
        System.out.println("Task 3");
        Double D = 1234.234567;
        System.out.println("Double number: " + d + '\n' +
                "\tbyte = " + D.byteValue() +
                "\tshort = " + D.shortValue() +
                "\tint = " + D.intValue() +
                "\tlong = " + D.longValue() +
                "\tfloat = " + D.floatValue() +
                "\tdouble = " + D.doubleValue() +
                "\tchar = " + (char)(D.intValue()) +
                "\tbool = " + (D != 0));
        System.out.println("Task 4");
        System.out.println(D);
        System.out.println("Task 5");
        st = Double.toString(3.14);
        System.out.println("String literal: " + st);
        return 0;
    }

    private int shells_2(){
        int lines = 13, columns = 10;
        String[][] table = new String[lines][columns];
        table[0][0] = "";
        /*...*/
        table[0][1] = "Boolean"; table[0][2] = "Byte"; table[0][3] = "Character";
        table[0][4] = "Double"; table[0][5] = "Float"; table[0][6] = "Integer";
        table[0][7] = "Long"; table[0][8] = "Short";  table[0][9] = "isShort";
        /*...*/
        table[1][0] = "byteValue"; table[2][0] = "doubleValue"; table[3][0] = "floatValue";
        table[4][0] = "intValue"; table[5][0] = "longValue"; table[6][0] = "shortValue";
        table[7][0] = "parseXxx"; table[8][0] = "parseXxx with radix"; table[9][0] = "valueOf with radix";
        table[10][0] = "toString";  table[11][0] = "toString(primitive)";  table[12][0] = "toString(primitive,radix)";
        /*...*/
        table[7][1] = "x"; table[11][1] = "x"; //Boolean
        table[7][2] = "x"; table[8][2] = "x"; table[9][2] = "x"; table[11][2] = "x"; //Byte
        table[11][3] = "x"; table[9][3] = "x"; //Character
        table[7][4] = "x"; table[11][4] = "x"; //Double
        table[7][5] = "x"; table[11][5] = "x"; //Float
        table[7][6] = "x"; table[8][6] = "x"; table[9][6] = "x"; table[11][6] = "x"; table[12][6] = "x"; //Integer
        table[7][7] = "x"; table[8][7] = "x"; table[9][7] = "x"; table[11][7] = "x"; table[12][7] = "x"; //Long
        table[7][8] = "x"; table[8][8] = "x";table[9][8] = "x"; table[11][8] = "x"; //Short
        /*...*/
        for (int i = 0; i < lines; i++)
            for (int j = 0; j < columns; j++)
                if(table[i][j] == null)
                    table[i][j] = "-";
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (j==0)
                    System.out.printf("%-27s", table[i][j]);
                else
                    System.out.printf("%-10s", table[i][j]);
            }
            System.out.print("\n");
        }
        return 0;
    }

    private int formater_1(){
        System.out.println("Converter.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        Double money = sc.nextDouble();
        Map<String,Double> kurs = Map.of(
                "RUB", 1.0,
                "USD", 0.015783,
                "EUR", 0.014826,
                "CNY", 0.10979
        );
        System.out.printf( "" +
                "RUB in USD: " + NumberFormat.getCurrencyInstance(Locale.US).format(money/kurs.get("RUB")*kurs.get("USD")) +
                "\nUSD in RUB: %.2f" + "₽" +
                "\nUSD in EUR: " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(money/kurs.get("USD")*kurs.get("EUR")) +
                "\nRUB in EUR: " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(money/kurs.get("RUB")*kurs.get("EUR")) +
                "\nCNY in CNY: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(money/kurs.get("CNY")*kurs.get("CNY")) +
                "\nCNY in USD: " + NumberFormat.getCurrencyInstance(Locale.US).format(money/kurs.get("CNY")*kurs.get("USD")) +
                "\n",
                money/kurs.get("USD")*kurs.get("RUB") );
        return 0;
    }

    private int formater_2(){
        Scanner sc = new Scanner(System.in);
        List<String> basket = new ArrayList<String>();
        String[] product = {"Hard disk", "Fan Gembird", "Sound card", "Power supply", "HDD Enclosure",
                "Fan Whatsminer", "Thermal padding", "Studio Sound Card Antelope", "Studio Sound Card Solid"};
        Integer[] price = {9983, 121, 183, 3017, 257, 772, 934, 68357, 22731};
        String[] symbol = {"hd", "f1", "sc", "p", "he", "f2", "t", "sa", "ss"};
        System.out.println("\nSTORE");
        for(int i = 0; i < product.length; i++)
            System.out.println(symbol[i] + " - " + product[i] + ",\tprice: " + price[i]);
        char answer;
        String sym;
        int sum = 0;
        while(true) {
            System.out.print("\nDo you want see or add information in basket?" +
                    "\t(Tap 'a' for add, 's' for see and some else for exit)\n" +
                    "\tEnter your choice: ");
            answer = sc.next().charAt(0);
            int i = 0;
            if (answer != 's' && answer != 'a') break;
            switch(answer){
                case 's':
                    for (; i < basket.size(); i++)
                        System.out.println("\t\t" + basket.get(i));
                    break;
                case 'a':
                    System.out.print("\tEnter the product symbol: ");
                    sym = sc.next();
                    while(!sym.equals(symbol[i]))
                        i++;
                    basket.add(product[i]);
                    sum += price[i];
                    break;
            }
        }
        System.out.println("Enter currency(RUB, USD, EUR, CNY: ");
        Map<String,Double> kurs = Map.of(
                "RUB", 1.0,
                "USD", 0.015783,
                "EUR", 0.014826,
                "CNY", 0.10979
        );
        sym = sc.next();
        if (sym == "RUB")
            System.out.println("Your sum: " + sum + "₽");
        else{
            Locale loc = new Locale("US");
            if (sym.equals("USD"))
                Locale.setDefault(Locale.US);
            else if (sym.equals("EUR"))
                Locale.setDefault(Locale.GERMANY);
            else if (sym.equals("CNY"))
                Locale.setDefault(Locale.CHINA);
        }
        System.out.printf("Your sum:" +  sum);
        return 0;
    }

}
