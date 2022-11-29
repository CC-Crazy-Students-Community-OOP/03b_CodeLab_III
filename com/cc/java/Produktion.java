package com.cc.java;

public class Produktion extends Mitarbeiter {
    private String id;

    public Produktion(String firstName, String lastName, int birthYear, String workID, String department, String role) {
        super( firstName, lastName, birthYear, workID, department, role );
    }

    @Override
    public void doYourWork() { Out.o( getInfo( workID ) ); }
}
