package com.cc.java;

public class Werbung extends Mitarbeiter {
    private String id;

    public Werbung(String firstName, String lastName, int birthYear, String workID, String department, String role) {
        super( firstName, lastName, birthYear, workID, department, role );
    }

    @Override
    public void doYourWork() { Out.o( getInfo( workID ) ); }
}