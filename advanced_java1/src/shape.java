interface Shape {
    double pi = 3.14;
    abstract void draw();
    abstract double getArea();
    default void redraw() {
        System.out.println("--다시 그립니다--");
        draw();
    }
}
