class BankAccount implements Ressetable {
    private int balance;
    private final int initialBalance;

    public BankAccount(int balance){
        this.balance = balance;
        this.initialBalance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }
    @Override
    public void reset(){
        balance = initialBalance;
    }
    @Override
    public String toString(){
        return "잔액 : " + balance;
    }
}
