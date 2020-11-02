package SegundoCaso;

public class CowFactory implements AbstractFactory{

	@Override
	public Hearth createHearth() {
		return new CowHearth();
	}

	@Override
	public Lung createLung() {
		return new CowLung();
	}
	
}
