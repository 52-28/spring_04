package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.Dress;
import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {

    public void start() {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        
    	// the cosyDrinkAdvice is created
        WizardInterface myWizard = context.getBean("theWizard2", WizardInterface.class);

        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.changeDress());
        System.out.println("******************");
        System.out.println(myWizard.giveAdvice());
    }
}
