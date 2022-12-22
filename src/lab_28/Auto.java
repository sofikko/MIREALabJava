package lab_28;

public class Auto {
    public String brand, model, type;
    private final Wheels wheels=new Wheels("Toyo");

    public Auto() { }

    Auto(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    Auto(String brand, String model, String type){
        this.brand=brand;
        this.model=model;
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineSound(){
        System.out.println("Газуй не жалей");
    }

    private class Wheels { //Вложенный внутренний класс
        private String manufacturer;

        private Wheels(String manufacturer){
            this.manufacturer=manufacturer;
        }

        public String toString() {
            return "Wheels{" +
                    "manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }

    public static class Sedan extends Auto { //Вложенный статический класс
        Sedan(String brand, String model) {
            super(brand, model);
            setType("Sedan");
        }
    }

    public class F1Car extends Auto { //Вложенный класс

        F1Car(String brand, String model) {
            super(brand, model);
            setType("F1 car");
        }

        public void engineSound(){
            System.out.println("Громкий звук двигателя");
        }
    }

    public static void main(String[] args) {

        Auto sedan=new Sedan("Audi", "A4");
        Auto notAnonF1Car=new Auto().new F1Car("Ferrari", "SF21");
        Auto anonF1Car=new Auto("McLaren", "MCL35M", "F1 car") { //Анонимный класс

            public void engineSound() {
                System.out.println("Громкий звук двигателя");
            }
        };

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(sedan.toString());
        sedan.engineSound();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(anonF1Car.toString());
        anonF1Car.engineSound();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(notAnonF1Car.toString());
        notAnonF1Car.engineSound();

        System.out.println("---------------------------------------------------------------------------------------");
    }



    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", " + wheels.toString() +
                '}';
    }
}