package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(5, 4);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", shape.getSideA(), shape.getSideB());
        ShapeView view = new ShapeView(shape);
        view.showArea();
    }
}
