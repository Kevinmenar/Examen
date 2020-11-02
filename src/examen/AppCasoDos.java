package examen;

import SegundoCaso.Cow;
import SegundoCaso.Pig;
import SegundoCaso.Prototype;

public class AppCasoDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cow cow = new Cow();
		Pig pig = new Pig();
		
		Cow cowClone = cow.copy();
		Pig pigClone = pig.copy();
		
		cow.getHearth().getName();
		cowClone.getHearth().getName();
		
		System.out.println("Vaca Orinal: " + cow.getLung().getName());
		System.out.println("Vaca clonada: " + cowClone.getLung().getName());
	}

}
