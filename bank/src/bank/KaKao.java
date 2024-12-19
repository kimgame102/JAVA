package bank;

public class KaKao extends Bank {
    @Override
    public int showBalance() {
    	this.setMoney(getMoney() / 2);
    	return super.showBalance();
    }
}

