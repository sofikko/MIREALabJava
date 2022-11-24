package lab2.Shop;

public class Computer {
    private String brand; // ASUS DELL ALIENWARE IRU ACER LENOVO MSI HP
    private String processor; //Pentium   Ryzen 5   Core i9
    private int RAM; //2 / 4 /8 / 12 / 16
    private int SSD; //128 / 256/ 512/ 1024

    Computer(String brand, String processor, int ram, int ssd){
        this.brand = brand;
        this.processor = processor;
        RAM = ram;
        SSD = ssd;
    }
    public String get_brand() {return brand;}
    public boolean equal(String brand, String proc, int ram, int ssd){
        return (this.brand.equals(brand) && processor.equals(proc) && RAM == ram && SSD == ssd);
    }
    public String toString(){
        return "computer {" +
                "brand=" + brand +
                ", processor=" + processor +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                "}";
    }
}
