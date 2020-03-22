package hW7;

public class TyrannosaurTest implements AnimalClassTester {

	@Override
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.aboutMe().contentEquals("try")) {
				if (t.diet().contentEquals("food for TRYNO")) {
					if (t.Movement().contentEquals("crawl")) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
