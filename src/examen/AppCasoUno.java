package examen;

import PrimerCaso.AbstractFactory;
import PrimerCaso.Bank;
import PrimerCaso.Count;
import PrimerCaso.Credit;
import PrimerCaso.GoldFactory;
import PrimerCaso.Insight;
import PrimerCaso.InsightCreator;
import PrimerCaso.Investment;
import PrimerCaso.InvestmentCreator;
import PrimerCaso.Mortgage;
import PrimerCaso.Pledge;
import PrimerCaso.StandarFactory;
import PrimerCaso.TenFactory;
import PrimerCaso.Term;
import PrimerCaso.TermCreator;
import PrimerCaso.Trust;
import PrimerCaso.YoungFactory;

public class AppCasoUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		
		AbstractFactory abstractFactory0;
		AbstractFactory abstractFactory2;
		AbstractFactory abstractFactory1;
		AbstractFactory abstractFactory3;
		
		abstractFactory0 = new YoungFactory();
		abstractFactory1 = new TenFactory();
		abstractFactory2 = new GoldFactory();
		abstractFactory3 = new StandarFactory();
		
		Count young = new Count();
		Count ten = new Count();
		Count gold = new Count();
		Count standar = new Count();
		
		young.setCard(abstractFactory0.createCard());
		young.setInterest(abstractFactory0.createInterest());
		young.setProfile(abstractFactory0.createProfile());
		
		ten.setCard(abstractFactory1.createCard());
		ten.setInterest(abstractFactory1.createInterest());
		ten.setProfile(abstractFactory1.createProfile());
		
		gold.setCard(abstractFactory2.createCard());
		gold.setInterest(abstractFactory2.createInterest());
		gold.setProfile(abstractFactory2.createProfile());
		
		standar.setCard(abstractFactory3.createCard());
		standar.setInterest(abstractFactory3.createInterest());
		standar.setProfile(abstractFactory3.createProfile());
		
		InvestmentCreator investmentCreator0;
		InvestmentCreator investmentCreator1;
		
		investmentCreator0 = new InsightCreator();
		investmentCreator1 = new TermCreator();
		
		Insight insight = (Insight) investmentCreator0.createInvestment();
		Term term = (Term) investmentCreator1.createInvestment();
		
		Credit credit1;
		Credit credit2;
		Credit credit3;
		
		credit1 = new Trust();
		credit2 = new Pledge();
		credit3 = new Mortgage();
		
	}

}
