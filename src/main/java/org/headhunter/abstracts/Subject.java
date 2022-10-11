package org.headhunter.abstracts;

import org.headhunter.interfaces.IObserver;
import org.headhunter.interfaces.ISubject;

import java.util.ArrayList;

public abstract class Subject implements ISubject {
    private ArrayList<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(IObserver observer: observers) {
            observer.update();
        }
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

}
