class Point implements Ressetable {
    private double x, y;
    private final double initialx, initialy;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
        this.initialx = x;
        this.initialy = y;
    }

    public void move(double dx, double dy){
        x += dx;
        y += dy;
    }

    @Override
    public void reset(){
        x = initialx;
        y = initialy;
    }

    @Override
    public String toString(){
        return "좌표 : (" + x + ", " + y + ")";
    }
}
