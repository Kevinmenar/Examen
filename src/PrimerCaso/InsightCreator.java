package PrimerCaso;

public class InsightCreator implements InvestmentCreator{

	@Override
	public Investment createInvestment() {
		System.out.println("Investment Creado");
		return new Insight();
	}
	
}
