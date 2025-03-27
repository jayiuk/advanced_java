public class App {
    public static void main(String[] args) {
        System.out.println("hw7_3 anonymous class 전영욱");
        Speakable myDog = new Speakable() {
            public void speak() {
                System.out.println("멍멍");
            }
        };
        myDog.speak();
        Speakable clock = new Speakable() {
            private int number = 5;
            public void speak() {
                for (int i = 0; i < number; i++) {
                    System.out.print("삐");
                }
                System.out.println();
                number += 3;
            }
        };
        clock.speak();
        clock.speak();
    }
}
