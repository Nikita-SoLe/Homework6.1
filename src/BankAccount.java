public class BankAccount {
    private double balance;
    public BankAccount(double money) {
        balance = money;
    }
    public BankAccount() {
        balance = 0L;
    }
    public void addMoney(double money) {
        balance += money;
        System.out.println("Добавлено "+money+"руб.");
        System.out.println("На вашем счету "+getBalance()+"руб.");
    }
    public void withdrawMoney(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Снято с баланса "+money+"руб.");
        } else {
            System.out.println("Недостаточно денег на счету.");
        }
    }
    public double getBalance() {
        return balance;
    }
}

