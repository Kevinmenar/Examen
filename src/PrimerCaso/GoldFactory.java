package PrimerCaso;

public class GoldFactory implements AbstractFactory{

	@Override
	public Card createCard() {
		System.out.println("Tarjeta Gold Creado");
		return new GoldCard();
	}

	@Override
	public Profile createProfile() {
		System.out.println("Perfil Gold Creado");
		return new GoldProfile();
	}

	@Override
	public Interest createInterest() {
		System.out.println("Interes Gold Creado");
		return new GoldInterest();
	}

}
