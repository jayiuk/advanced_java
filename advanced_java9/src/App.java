import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("hw12_1 전영욱");

        Stream.of("갈매기", "나비", "다람쥐", "라마") //stream으로 list객체 생성
              .filter(s -> s.length() == 2) // 체이닝 메서드. 여기서 filter로 길이가 2인 문자열을 찾는다
              .limit(1) // limit을 사용해 앞에서 딱 한개만 가져오게 한다.
              .forEach(System.out::println); // limit까지 한 걸 출력
    }
}