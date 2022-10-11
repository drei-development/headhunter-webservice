package org.headhunter.abstracts;

import org.headhunter.interfaces.Observer;
import org.headhunter.model.ITSpecialist;

public abstract class Headhunter implements Observer {

    private ITSpecialist subject;
    public Headhunter(ITSpecialist subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public ITSpecialist getSubject() {
        return this.subject;
    }

    public abstract void update();
}
