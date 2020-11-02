package SegundoCaso;

public class Pig implements Prototype{
	private Hearth hearth;
	private Lung lung;
	private AbstractFactory abstractfactory;
	
	public Pig(Pig pig) {
		abstractfactory = new PigFactory();
		this.hearth = abstractfactory.createHearth();
		this.lung = abstractfactory.createLung();
	}

	public Pig() {
		abstractfactory = new PigFactory();
		this.hearth = abstractfactory.createHearth();
		this.lung = abstractfactory.createLung();
	}
	
	public Hearth getHearth() {
		return hearth;
	}



	public void setHearth(Hearth hearth) {
		this.hearth = hearth;
	}



	public Lung getLung() {
		return lung;
	}



	public void setLung(Lung lung) {
		this.lung = lung;
	}



	public AbstractFactory getAbstractfactory() {
		return abstractfactory;
	}



	public void setAbstractfactory(AbstractFactory abstractfactory) {
		this.abstractfactory = abstractfactory;
	}



	@Override
	public Pig copy() {
		return new Pig(this);
	}
}
