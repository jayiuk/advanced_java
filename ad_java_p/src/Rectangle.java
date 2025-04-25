public class Rectangle extends Shape {
    int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("사각형 그림");
    }

    public double findArea() {
        return width * height;
    }

}
