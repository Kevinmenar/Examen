package PrimerCaso;

public class Count {
	private Card card;
	private Profile profile;
	private Interest interest;
	
	public Count(Card card, Profile profile, Interest interest) {
		this.card = card;
		this.profile = profile;
		this.interest = interest;
	}

	public Count() {
		// TODO Auto-generated constructor stub
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}
}
