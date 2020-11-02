package PrimerCaso;

import java.util.Date;

public class Insight implements Investment{

	private double saldo;
	private String owner;
	private Date withdrawDay;
	
	@Override
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void interestPayment() {
		this.saldo = this.saldo * 0.01;
	}

	@Override
	public void withdrawals(int amount) {
		if(amount<=this.saldo) {
			this.saldo = this.saldo - amount;
		}
	}

	@Override
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
