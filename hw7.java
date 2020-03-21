package hW7;

public class hw7 {

	public static void main(String[] args) {
		
		TyrannosaurTest t=new TyrannosaurTest();
		Tyrannosaur clarence = new Tyrannosaur(); 
		if (t.testAnimalObject((Object)clarence)) 
		{ 
			System.out.println("Tyrranosaur class passes");
		} 
		else 
		{
			 System.out.println(">>>>Tyrranosaur class Failed!<<<<");
			 
		}
		/* penguin*/
		PenguinTest p=new PenguinTest();
		Penguin opus = new Penguin(); 
		if (p.testAnimalObject((Object)opus)) {
	    System.out.println("Penguin class passes"); } else {
	    System.out.println(">>>>Penguin class Failed!<<<<"); }
		
		
		/* cow*/
		
		CowTest ct=new CowTest();
		Cow mrsolearys = new Cow();
		if (ct.testAnimalObject(mrsolearys)) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}	
		
		/*octopus*/
		OctopusTest test =new OctopusTest();
		Octopus g=new Octopus();
		if (test.testAnimalObject(g)) {
			System.out.println("Octopus class passes");
		} else {
			System.out.println(">>>>Octopus class Failed!<<<<");
		}
		
		
		
	}

}
