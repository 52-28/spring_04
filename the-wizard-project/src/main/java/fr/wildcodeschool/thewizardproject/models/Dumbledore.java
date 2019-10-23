package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

	private Dress dress;
	
    // Constructor with the cosyDrinkAdvice object passed as an argument
    public Dumbledore(Dress theDress) {
        dress = theDress;
    }

    @Override
    public String changeDress() {
        return this.dress.returnDress();
    }
    
    
    @Override
    public String giveAdvice() {
    	return "toto";
    }
}
