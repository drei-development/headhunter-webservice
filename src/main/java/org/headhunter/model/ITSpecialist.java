package org.headhunter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.headhunter.abstracts.Subject;
import java.util.ArrayList;

public class ITSpecialist extends Subject {
    private String firstName;
    private String lastName;
    private int age;
    private int workExperience;
    private ArrayList<String> programmingLanguages = new ArrayList<>();

    public ITSpecialist() {
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }
    public void addProgrammingLanguage(String language) {
        programmingLanguages.add(language);
        notifyObservers();
    }
    public void removeProgrammingLanguage(String language) {
        programmingLanguages.remove(language);
    }

    public int getWorkExperience() {
        return this.workExperience;
    }
    public void setWorkExperience(int experience) {
        this.workExperience = experience;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "This is the name " + this.firstName;
    }
}
