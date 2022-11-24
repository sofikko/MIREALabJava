package lab2.Shop;

import java.util.Scanner;

public class TestShop {
    public static void main (String[] args) {
        Shop sh = new Shop();
        sh.add("ASUS", "Core i9", 12, 512, 70000);
        sh.add("DELL", "Pentium", 8, 128, 61900);
        sh.add("ALIENWARE", "Ryzen 5", 8, 256, 14092);
        sh.add("IRU", "Core i9", 8, 256, 71356);
        sh.add("ACER", "Pentium", 4, 256, 30876);
        Scanner sc = new Scanner(System.in);
        String answ = "";
        while (true) {
            System.out.println("What do you want do?\n\t" +
                    "'w' - watch a product range\n\t" +
                    "'a' - add\n\t" +
                    "'ri' - remove by info\t'rn' - remove by idex\n\t" +
                    "'fc' - find by cost\t'fn' - find by name\n\t" +
                    "'sc' - sort by cost\t'sn' - sort by name\n\t\t(0 - for exit)");
            answ = sc.nextLine();
            if ((answ.equals("0"))) {
                System.out.println("Exit. By.");
                break;
            }
            String brand, processor;
            int ssd, ram, cost, index;
            switch (answ.charAt(0)) {
                case 'w':
                    sh.show();
                    break;
                case 'a':
                    System.out.print("Enter brand: ");
                    brand = sc.nextLine();
                    System.out.print("Enter processor: ");
                    processor = sc.nextLine();
                    System.out.print("Enter RAM: ");
                    ram = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter SSD: ");
                    ssd = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter computer's cost: ");
                    cost = Integer.parseInt(sc.nextLine());
                    sh.add(brand, processor, ram, ssd, cost);
                    break;
                case 'r':
                    switch (answ.charAt(1)) {
                        case 'i':
                            System.out.print("Enter brand: ");
                            brand = sc.nextLine();
                            System.out.print("Enter processor: ");
                            processor = sc.nextLine();
                            System.out.print("Enter RAM: ");
                            ram = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter SSD: ");
                            ssd = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter computer's cost: ");
                            cost = Integer.parseInt(sc.nextLine());
                            sh.remove(brand, processor, ram, ssd, cost);
                            break;
                        case 'n':
                            System.out.print("Enter computer's id: ");
                            sh.remove(Integer.parseInt(sc.nextLine()));
                            break;
                    }
                    break;
                case 'f':
                    switch (answ.charAt(1)) {
                        case 'c':
                            System.out.print("Enter cost: ");
                            sh.find_cost(Integer.parseInt(sc.nextLine()));
                            break;
                        case 'n':
                            System.out.print("Enter brand: ");
                            sh.find_name(sc.nextLine());
                            break;
                    }
                    break;
                case 's':
                    switch (answ.charAt(1)) {
                        case 'c':
                            sh.sort_cost();
                            break;
                        case 'n':
                            sh.sort_name();
                            break;
                    }
                    break;
            }
        }
    }
}
