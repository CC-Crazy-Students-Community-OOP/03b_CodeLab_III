package com.cc.java;

public abstract class Person {
    public abstract void doYourWork();

    private int birthYear;
    private String firstName, lastName;
    private boolean lunch, starts;
    public String workID, department, role;

    public Person( String firstName, String lastName, int birthYear, String workID, String department, String role ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
    }

    public int getBirthYear() { return birthYear; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getWorkID() { return workID; }
    public String getDepartment() { return department; }
    public String getRole() { return role; }

    public void setBirthYear( int birthYear ) { this.birthYear = birthYear; }
    public void setFirstName( String firstName ) { this.firstName = firstName; }
    public void setLastName( String lastName ) { this.lastName = lastName; }
    public void setWorkID( String workID ) { this.workID = workID; }
    public void setDepartment( String department ) { this.department = department; }
    public void setRole( String role ) { this.role = role; }

    public void hasLunch( boolean lunch ) { this.lunch = lunch; }
    public void setRole( boolean starts ) { this.starts = starts; }

    public String getInfo( String workID ) { return workID; }
}
