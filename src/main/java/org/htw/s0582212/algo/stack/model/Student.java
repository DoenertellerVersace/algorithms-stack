package org.htw.s0582212.algo.stack.model;

public class Student {
    private String firstName;
    private String lastName;
    private StudyProgram program;
    private int studentNo;

    public int getStudentNo() {
        return studentNo;
    }

    public Student studentNo(int studentNo) {
        this.studentNo = studentNo;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudyProgram getProgram() {
        return program;
    }

    public Student program(StudyProgram program) {
        this.program = program;
        return this;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + program + ", matrikelnr" + studentNo;
    }
}
