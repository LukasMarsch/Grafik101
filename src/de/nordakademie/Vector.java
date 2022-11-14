package de.nordakademie;

public class Vector {
    public double x;
    public double y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double length(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));

    }
}
