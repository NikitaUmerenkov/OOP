package Sem6.task4;

public class Square extends RightAngleShape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }
}
