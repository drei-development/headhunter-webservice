package org.headhunter.abstracts;

import org.headhunter.interfaces.IObserver;
import org.headhunter.interfaces.ISubject;
import org.headhunter.model.ITSpecialist;

public abstract class Observer implements IObserver {

    private ISubject subject;
    public Observer(ISubject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }
    public Observer() {

    }

    public ISubject getSubject() {
        return this.subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
