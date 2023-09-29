package srp1;

import srp1.figure.FigureDrawer;
import srp1.figure.Point;
import srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        new FigureDrawer(square).draw();
    }
}
