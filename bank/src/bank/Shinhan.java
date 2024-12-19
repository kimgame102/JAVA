package bank;

public class Shinhan extends Bank {
    @Override
    public void deposit(int money) {
    	money /= 2;
    	super.deposit(money);//부모에게 가기 전에 돈 50%절감
    }
}

