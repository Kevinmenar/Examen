package SegundoCaso;

public class PigFactory implements AbstractFactory{

	@Override
	public Hearth createHearth() {
		return new PigHearth();
	}

	@Override
	public Lung createLung() {
		return new PigLung();
	}

}
