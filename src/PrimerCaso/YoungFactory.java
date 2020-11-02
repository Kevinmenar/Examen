package PrimerCaso;

public class YoungFactory implements AbstractFactory{

	@Override
	public Card createCard() {
		System.out.println("Tarjeta Young Creado");
		return new YoungCard();
	}

	@Override
	public Profile createProfile() {
		System.out.println("Perfil Young Creado");
		return new YoungProfile();
	}

	@Override
	public Interest createInterest() {
		System.out.println("Interes Young Creado");
		return new YoungInterest();
	}

}
