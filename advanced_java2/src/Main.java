public class Main {
    public static void main(String[] args) {
        System.out.println("hw7_2 Ressetable 인터페이스 전영욱");
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account);
        account.reset();
        System.out.println(account);
        Point point  = new Point(1.5, 2.5);
        point.move(2.1, 2.1);
        point.move(10.0, 10.0);
        System.out.println(point);
        point.reset();
        System.out.println(point);

    }
}
