package online_quiz;

import java.util.*;

class Student {
    private String name;
    private String Roll_no;
    private List<Integer> marks;

    public Student(String name, String Roll_no) {
        this.name = name;
        this.Roll_no = Roll_no;
        marks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getRoll_no() {
        return this.Roll_no;
    }

    public List<Integer> getMarks() {
        return this.marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_No(String Roll_no) {
        this.Roll_no = Roll_no;
    }

}