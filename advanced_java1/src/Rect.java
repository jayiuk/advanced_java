public class Rect implements Shape {
    int bottom, height;
    public Rect(int bottom, int height){
        this.bottom = bottom;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println(+bottom+"X"+height+"크기의 사각형입니다.");
    }
    @Override
    public double getArea(){
        return height * bottom;
    }
}
