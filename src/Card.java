public class Card extends BankAccount {
    public Card(long money) {
        super(money);
    }
    @Override
    public void withdrawMoney(double money) {
        double percent = money * 0.01;
        super.withdrawMoney(money + percent);
    }
}
