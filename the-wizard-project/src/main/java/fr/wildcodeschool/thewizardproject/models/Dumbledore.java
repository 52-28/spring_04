package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Dumbledore implements WizardInterface {

	private Dress dress;
	
	@Autowired
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
