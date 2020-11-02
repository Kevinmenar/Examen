package PrimerCaso;

import java.util.List;

public class Trust implements Credit{
	
	private double amount;
	private String waranty;
	private List tablePayment;
	private String warantor;
	
	public Trust(double amount, String waranty, List tablePayment, String warantor) {
		this.amount = amount;
		this.waranty = waranty;
		this.tablePayment = tablePayment;
		this.warantor = warantor;
	}

	public Trust() {
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
