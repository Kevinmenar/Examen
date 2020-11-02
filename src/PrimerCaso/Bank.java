package PrimerCaso;

import java.util.ArrayList;

public class Bank {
	private ArrayList<AbstractFactory> abstractFactory;
	private ArrayList<Credit> credits;
	private ArrayList<Investment> investments;
	
	public Bank(ArrayList<AbstractFactory> abstractFactory, ArrayList<Credit> credits, ArrayList<Investment> investments) {
		this.abstractFactory = abstractFactory;
		this.credits = credits;
		this.investments = investments;
	}

	public Bank() {
	}

	public ArrayList<AbstractFactory> getAbstractFactory() {
		return abstractFactory;
	}

	public void setAbstractFactory(ArrayList<AbstractFactory> abstractFactory) {
		this.abstractFactory = abstractFactory;
	}

	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public void setCredits(ArrayList<Credit> credits) {
		this.credits = credits;
	}

	public ArrayList<Investment> getInvestments() {
		return investments;
	}

	public void setInvestments(ArrayList<Investment> investments) {
		this.investments = investments;
	}
	
	
}
