public class Main {
    public static void main(String[] args) throws InterruptedException {

        long money = 1000L;

        Deposit dep = new Deposit(money);

        dep.withdrawMoney(10);
        Thread.sleep(10000);
        dep.withdrawMoney(10);
        Thread.sleep(15000);
        dep.withdrawMoney(10);
        Thread.sleep(30000);
        dep.withdrawMoney(10);
    }
}