public class Labtop extends Computer implements Portable {
    public void InMyBag() {
        System.out.println("labtop is in my bag");
    }

    public void turnOn(){
        System.out.println("노트북을 킨다.");
    }

    public void turnOff(){
        System.out.println("turn off labtop");
    }

    public static void main(String[] args) {
        Labtop l = new Labtop();
        l.turnOn();
        l.turnOff();
        l.InMyBag();
    }
}
