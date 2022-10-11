package org.headhunter.abstracts;

import org.headhunter.interfaces.Observer;
import org.headhunter.interfaces.Subject;

import java.util.ArrayList;

public abstract class Person implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
