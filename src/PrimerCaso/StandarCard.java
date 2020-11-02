package PrimerCaso;

public class StandarCard implements Card{
	
	private String type;
	private String benefit;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getBenefit() {
		return benefit;
	}

	@Override
	public void setType(String type) {
		this.type = type;
		
	}

	@Override
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

}
