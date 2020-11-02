package PrimerCaso;

public class TermCreator implements InvestmentCreator{

	@Override
	public Investment createInvestment() {
		System.out.println("Term Creado");
		return new Term();
	}
	
}
