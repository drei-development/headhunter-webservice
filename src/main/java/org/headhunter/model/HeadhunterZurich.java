package org.headhunter.model;

import org.headhunter.abstracts.Observer;

import java.util.ArrayList;

public class HeadhunterZurich extends Observer {


    private ITSpecialist specialist = ((ITSpecialist) super.getSubject());

    public HeadhunterZurich(ITSpecialist subject) {
        super(subject);
    }

    public void update() {
        ArrayList<String> programmingLanguages = specialist.getProgrammingLanguages();
        for(String  language: programmingLanguages) {
            if (language.equals("Python")) {
                System.out.println("Den nehmen wir!");
            }
        }
    }
}
