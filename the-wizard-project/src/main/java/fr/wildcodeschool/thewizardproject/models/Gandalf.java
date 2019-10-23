package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Gandalf implements WizardInterface{
	private Dress dress;
	
	@Autowired
	public Gandalf(Dress theDress) {
        dress = theDress;
    }

    @Override
    public String changeDress() {
        return this.dress.returnDress();
    }
    
    @Override
    public String giveAdvice() {
    	return "tata";
    }
}
