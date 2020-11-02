package PrimerCaso;

public class StandarFactory implements AbstractFactory{

	@Override
	public Card createCard() {
		System.out.println("Tarjeta Standar Creado");
		return new StandarCard();
	}

	@Override
	public Profile createProfile() {
		System.out.println("Perfil Standar Creado");
		return new StandarProfile();
	}

	@Override
	public Interest createInterest() {
		System.out.println("Interes Standar Creado");
		return new StandarInterest();
	}

}
