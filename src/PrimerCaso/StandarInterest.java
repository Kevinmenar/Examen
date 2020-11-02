package PrimerCaso;

public class StandarInterest implements Interest {

	private float interest;
	
	@Override
	public float getInterest() {
		return this.interest;
	}

	@Override
	public void setInterest(float interest) {
		this.interest = interest;
	}

}
