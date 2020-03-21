package hW7;

public class PenguinTest implements AnimalClassTester  {
	@Override
	public boolean testAnimalObject(Object animal) {
		// TODO Auto-generated method stub
		
		if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			if (p.flightless().contentEquals("penguin")) {
				if (p.IEat().contentEquals("mostly fish")) {
					if (p.movement().equalsIgnoreCase("waddle and swim")) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
}
