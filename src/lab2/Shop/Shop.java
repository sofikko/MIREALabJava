package lab2.Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private class Comp {
        public int cost;
        public Computer computer;

        Comp(String brand, String processor, int ram, int ssd, int cost){
            computer = new Computer(brand, processor, ram, ssd);
            this.cost = cost;
        }

        public String toString(){
            return "product: {" + computer.toString() + ",\t cost = " + cost + " }";
        }
    }
    private List<Comp> c = new ArrayList<Comp>();

    public void add(String brand, String proc, int ram, int ssd, int cost){
        Comp temp = new Comp(brand, proc, ram, ssd, cost);
        this.c.add(temp);
    }
    public boolean remove(String brand, String proc, int ram, int ssd, int cost){
        for (int i = 0; i < c.size(); i++)
            if (c.get(i).cost == cost && c.get(i).computer.equal(brand, proc, ram, ssd)) {
                c.remove(i);
                return true;
            }
        return false;
    }
    public boolean remove(int id){
        if (id >= 0 && id < c.size()) {
            c.remove(id);
            return true;
        }
        return false;
    }
    public void sort_cost() {
        c.sort(new Comparator<Comp>() {
            @Override
            public int compare(Comp o1, Comp o2) {
                return o1.cost - o2.cost;
            }
        });
    }
    public void sort_name(){
        c.sort(new Comparator<Comp>() {
            @Override
            public int compare(Comp o1, Comp o2) {
                for (int i = 0; i < o1.computer.get_brand().length() && i < o2.computer.get_brand().length(); i++){
                     if (o1.computer.get_brand().charAt(i) != o2.computer.get_brand().charAt(i))
                         return o1.computer.get_brand().charAt(i) - o2.computer.get_brand().charAt(i);
                }
                return 0;
            }
        });
    }
    public void find_cost(int cost) {
        int counter = c.size();
        for (int i = 0; i < c.size(); i++)
            if (c.get(i).cost == cost) {
                System.out.println(c.get(i).toString());
                counter--;
            }
        if (c.size() == counter) {
            System.out.println("Dont't have computers to this cost. Some else:\n");
            for (; counter > 0 && c.size() - counter < 5; cost -= 1) {
                for (int i = 0; i < c.size() && counter > 0; i++)
                    if (c.get(i).cost == cost) {
                        System.out.println(c.get(i).toString());
                        counter--;
                    }
            }
        }
    }
    public void find_name(String name){
        for (int i = 0; i < c.size(); i++){
            if (c.get(i).computer.get_brand().equals(name)) {
                System.out.println(c.get(i).toString());
            }
        }
    }
    public void show(){
        for (int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).toString());
        }
    }
}
