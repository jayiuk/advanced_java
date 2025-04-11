import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        System.out.print("201914111 전영욱 hw11_1 Collection");
        String name = scanner.nextLine();
        int score;

        while (true) {
            System.out.print("점수를 입력하세요 : ");
            score = scanner.nextInt();
            if (score < 0) break;
            scores.add(score);
        }

        System.out.println("전체 학생은 " + scores.size() + "명이다.");

        System.out.print("학생들의 성적 : ");
        scores.forEach(s -> System.out.print(s + " "));
        System.out.println();

        int maxScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
            }
        }

        for (int i = 0; i < scores.size(); i++) {
            int s = scores.get(i);
            String grade;

            if (s >= maxScore - 10) {
                grade = "A";
            } else if (s >= maxScore - 20) {
                grade = "B";
            } else if (s >= maxScore - 30) {
                grade = "C";
            } else if (s >= maxScore - 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println(i + "번 학생의 성적은 " + s + "점이며 등급은 " + grade + "이다.");
        }

        scanner.close();
    }
}
