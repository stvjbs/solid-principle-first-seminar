package lsp1.shape;

public class Square extends Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int getSideA() {
        return side;
    }

    @Override
    public int getSideB() {
      return side;
    }
}
