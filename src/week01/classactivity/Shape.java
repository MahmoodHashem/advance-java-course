package week01.classactivity;


// Plymorphism (compile time ) ->  Overloading
public class Shape {

    public double area(double a) {
        return Math.pow(a, a);
    }

    public double area(double a, double b) {
        return a * b;
    }
}
 