public class Main{
    public static void main(String[] args){
        System.out.println("hw7_1: 전영욱");
        Shape[] shapes = {
            new Circle(10),
            new Circle(20),
            new Rect(10, 40),
            new Rect(20, 40)
        };
        for (Shape shape : shapes){
            shape.redraw();
        }
        for (Shape shape : shapes){
            System.out.println("면적은" + shape.getArea());
        }
    }
}
