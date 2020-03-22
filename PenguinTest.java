package hW7;

public class PenguinTest implements AnimalClassTester  {
	@Override
	public boolean testAnimalObject(Object animal) {
		// TODO Auto-generated method stub
		
		if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			if (p.aboutMe().contentEquals("Penguin")) {
				if (p.diet().contentEquals("food for penguin")) {
					if (p.Movement().equalsIgnoreCase("jump")) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
}
