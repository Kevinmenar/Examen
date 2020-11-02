package SegundoCaso;

public class Cow implements Prototype{
	private Hearth hearth;
	private Lung lung;
	private AbstractFactory abstractfactory;
	
	public Cow(Cow cow) {
		abstractfactory = new CowFactory();
		this.hearth = abstractfactory.createHearth();
		this.lung = abstractfactory.createLung();
	}

	public Cow() {
		abstractfactory = new CowFactory();
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
	public Cow copy() {
		return new Cow(this);
	}
}
