package PrimerCaso;

public class TenProfile implements Profile{
	
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
