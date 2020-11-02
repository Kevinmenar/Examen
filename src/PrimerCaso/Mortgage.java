package PrimerCaso;

import java.util.List;

public class Mortgage implements Credit{
	
	private double amount;
	private String waranty;
	private List tablePayment;
	
	public Mortgage(double amount, String waranty, List tablePayment) {
		this.amount = amount;
		this.waranty = waranty;
		this.tablePayment = tablePayment;
	}

	public Mortgage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public void pay(double amount) {
		this.amount = this.amount - amount;
	}

}
