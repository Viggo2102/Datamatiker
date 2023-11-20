import java.awt.*;

public class Points {

    double x, y;

    Points(double x, double y) { //Constructor
        this.x = x;
        this.y = y;
    }

    double distance(Points p) { //metode til at regne distancen mellem to punkter.
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));

    }

    public String toString() {
    return x + " " + y;
    }

    public static void main(String[] args) {
        Point A = new Point(10,2);
        Point B = new Point(4,7);
        Point C = new Point(1,-3);
        System.out.println(A);


    }
}



