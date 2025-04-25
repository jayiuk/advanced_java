public class TV implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("turn on TV");
    }

    @Override
    public void turnOff(){
        System.out.println("turn off TV");
    }
}
