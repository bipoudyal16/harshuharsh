package hW7;

public class OctopusTest implements AnimalClassTester {

	@Override
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Octopus)
		{
			Octopus o1 = (Octopus) animal;
			if (o1.aboutMe().contentEquals("Octopus")) 
			{
				if (o1.diet().contentEquals("food")) 
				{
					if (o1.Movement().contentEquals("walk")) 
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
