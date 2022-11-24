package lab2.Ball;

public class Ball {

    private double x, y;

    Ball(double x, double y) {  this.x = x; this.y = y; }
    Ball() {    x = 0.0;  y = 0.0;  }

    public double getX(){ return x; }
    public double getY(){ return y; }

    public void setX(double x){ this.x = x; }
    public void setY(double y){ this.y = y; }
    public void setXY(double x, double y){  this.x = x; this.y = y; }

    public void move(double xDisp, double yDisp){   this.x +=xDisp; this.y +=yDisp;}
    public String toString() {
        return "Ball {" +
                "x = " + x +
                ", y = " + y +
                "}";
    }

}
