public class ControllableDemo2 {
    public static void main(String[] args) {
        Controllable[] con = {new TV(), new Computer()};
        for (Controllable c : con) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }
}
