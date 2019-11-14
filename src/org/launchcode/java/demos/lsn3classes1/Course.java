package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    public String name;
    public int numOfSemesters;
    protected ArrayList<Student> students;

    public Course(String name, int numOfSemesters, ArrayList<Student> students) {
        this.name = name;
        this.numOfSemesters = numOfSemesters;
        this.students = students;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String aName) {
        this.name = aName;
    }

    public int getNumOfSemesters() {
        return this.numOfSemesters;
    }

    private void setNumOfSemesters(int aNumOfSemesters) {
        this.numOfSemesters = aNumOfSemesters;
    }

    protected ArrayList<Student> getStudents() {
        return this.students;
    }

    protected void setStudents(Student aStudent) {
        this.students.add(aStudent);
    }

}
