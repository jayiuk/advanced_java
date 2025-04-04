import java.util.Scanner;
import java.util.function.BiConsumer;

public class LambdaTest {
    public static void main(String[] args) {
        System.out.println("201914111 전영욱 람다식 곱셈 출력");
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        BiConsumer<Integer, Integer> m = (a, b) -> System.out.println("두 정수의 곱은" + (a * b) + "입니다.");
        System.out.print("첫 번째 정수 입력 : ");
        x = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        y = sc.nextInt();

        m.accept(x, y);
    }
}
