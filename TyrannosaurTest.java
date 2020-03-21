package hW7;

public class TyrannosaurTest implements AnimalClassTester {

	@Override
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.getName().contentEquals("Tyranosaurus Rex")) {
				if (t.roar().contentEquals("Roarrrr!")) {
					if (t.myFood().contentEquals("other dinosaurs")) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
