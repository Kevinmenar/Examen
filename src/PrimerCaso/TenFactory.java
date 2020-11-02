package PrimerCaso;

public class TenFactory implements AbstractFactory{

	@Override
	public Card createCard() {
		System.out.println("Tarjeta Ten Creado");
		return new TenCard();
	}

	@Override
	public Profile createProfile() {
		System.out.println("Perfil Ten Creado");
		return new TenProfile();
	}

	@Override
	public Interest createInterest() {
		System.out.println("Interes Ten Creado");
		return new TenInterest();
	}

}
