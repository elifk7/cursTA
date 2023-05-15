package tema1;

public class Shape {
    private int length;
    private int width;
    private double radius;
    public int calculateSquareArea(int length) {
        return length * length;
    }
    public int calculateRectangleArea(int length, int width) {
        return length * width;
    }
    public double calculateCircleArea(double radius) {
        return radius * radius * Math.PI;
    }

    public Shape(int length){
        int squareArea = calculateSquareArea(length);
        System.out.println("The area of the square is: " + squareArea);
    }
    public Shape(int length, int width){
        int squareRectangle = calculateRectangleArea(length, width);
        System.out.println("The area of the rectangle is: " + squareRectangle);
    }
    public Shape(double radius) {
        double squareCircle = calculateCircleArea(radius);
        System.out.println("The area of the circle is: " + squareCircle);
    }
}
