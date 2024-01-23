package com.company.Opps;

public class Exam {

    private String type;
    private int gainedMarks;
    private int totalMarks;

    public Exam(String type, int gainedMarks, int totalMarks) {
        this.type = type;
        this.gainedMarks = gainedMarks;
        this.totalMarks = totalMarks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGainedMarks() {
        return gainedMarks;
    }

    public void setGainedMarks(int gainedMarks) {
        this.gainedMarks = gainedMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "type='" + type + '\'' +
                ", gainedMarks=" + gainedMarks +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
