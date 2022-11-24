package lab2.Pound;

public class Dog {
    int age;
    String name;


    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int construct(){
        return age*7;
    }

    public String toString(){
        return "Dog = {" +
                "name = " + name +
                ", age = " + age +
                "}";
    }
}
