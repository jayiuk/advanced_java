import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class App {
    public static void main(String[] args) {
        System.out.println("hw10_1 timer using lambda 전영욱");        
        Timer t = new Timer(1000, (ActionEvent event) -> System.out.println("beep"));
        t.start();
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

