package com.cc.java;

public abstract class Mitarbeiter extends Person {
    public Mitarbeiter(String firstName, String lastName, int birthYear, String workID, String department, String role) {
        super( firstName, lastName, birthYear, workID, department, role );
    }


    public abstract void doYourWork();

}