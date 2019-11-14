package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    protected String firstName;
    public String lastName;
    public String subject;
    protected int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    protected String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    protected int getYearsTeaching() {
        return this.yearsTeaching;
    }

    protected void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }

}
