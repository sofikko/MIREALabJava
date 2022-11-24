package lab2.Author;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author (String name, String email, char gender){
        if (name.equals("")) name = "Not set";
        this.name = name;
        if (email.equals("")) email = "Not set";
        this.email = email;
        if (gender != 'f' && gender != 'm') gender = 't';
        this.gender = gender;
    }

    public void setEmail(String email){ this.email = email; }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender(){ return gender; }

    public String toString(){
        return "Author {" +
                "name = " + name +
                ", gender = " + gender +
                ", email = " + email +
                "}";
    }
}
