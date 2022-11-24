package lab2.Circle;

public class Circle {
    private Point point;
    private double radius;

    Circle(double x, double y, double radius){
        point = new Point(x,y);
        this.radius = radius;
    }

    public void setX(double x){point.setX(x);}
    public void setY(double y){point.setY(y);}
    public void setRadius(double radius){this.radius = radius;}

    public double getX(){return point.getX();}
    public double getY(){return point.getY();}
    public double getRadius(){return radius;}

    public String toString(){return "Circle {x = " + point.getX() +
            "; y = " + point.getY() + "; radius = " + radius + "}";}

}