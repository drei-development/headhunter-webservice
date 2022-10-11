package org.headhunter.model;

import org.headhunter.abstracts.Subject;
import java.util.ArrayList;

public class ITSpecialist extends Subject {

    private ArrayList<String> programmingLanguages = new ArrayList<>();
    private WorkExperience workExperience;

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }
    public void addProgrammingLanguage(String language) {
        programmingLanguages.add(language);
        notifyObservers();
    }
}
