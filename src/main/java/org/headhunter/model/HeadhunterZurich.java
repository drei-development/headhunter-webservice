package org.headhunter.model;

import org.headhunter.abstracts.Headhunter;

import java.util.ArrayList;

public class HeadhunterZurich extends Headhunter {


    public HeadhunterZurich(ITSpecialist subject) {
        super(subject);
    }

    public void update() {
        ArrayList<String> programmingLanguages = super.getSubject().getProgrammingLanguages();
        for(String  language: programmingLanguages) {
            if (language.equals("Python")) {
                System.out.println("Den nehmen wir!");
            }
        }
    }
}
