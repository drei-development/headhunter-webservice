package org.headhunter;

import org.headhunter.model.ITSpecialist;
import org.headhunter.model.HeadhunterZurich;


public class App 
{
    public static void main( String[] args ) {
        ITSpecialist Edwin = new ITSpecialist();
        HeadhunterZurich Zurich = new HeadhunterZurich(Edwin);

        Edwin.addProgrammingLanguage("Python");
    }
}
