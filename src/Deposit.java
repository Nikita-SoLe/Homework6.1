import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Deposit extends BankAccount {
    private LocalDateTime timeAdd;
    public Deposit(long money) {
        super(money);
        timeAdd = LocalDateTime.now();
    }
    @Override
    public void addMoney(double money) {
        super.addMoney(money);
        timeAdd = LocalDateTime.now();
    }
    @Override
    public void withdrawMoney(double money) {
        if (checkDate()) {
            super.withdrawMoney(money);
        }
    }
    private boolean checkDate() {
        if (timeAdd == null) return false;

        LocalDateTime now = LocalDateTime.now();
        long time = ChronoUnit.SECONDS.between(timeAdd, now);
        if (time >= 30)
            return true;
        else {
            System.out.println("Вы не можете снять средства, прошло только "+time+"сек должно пройти 30сек.");
            return false;
        }
    }
}
