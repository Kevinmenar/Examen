package PrimerCaso;

public class StandarProfile implements Profile{
	
	private String profile;

	@Override
	public String getProfile() {
		return this.profile;
	}

	@Override
	public void setProfile(String profile) {
		this.profile = profile;
		
	}

}
