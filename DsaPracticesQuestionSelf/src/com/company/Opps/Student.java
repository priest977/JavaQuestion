package com.company.Opps;

public class Student {

    private String name;
    private  int rolloNumber;
    private String standered;

    public Student(String name, int rolloNumber, String standered){
        this.name = name;
        this.rolloNumber = rolloNumber;
        this.standered = standered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRolloNumber() {
        return rolloNumber;
    }

    public void setRolloNumber(int rolloNumber) {
        this.rolloNumber = rolloNumber;
    }

    public String getStandered() {
        return standered;
    }

    public void setStandered(String standered) {
        this.standered = standered;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rolloNumber=" + rolloNumber +
                ", standered='" + standered + '\'' +
                '}';
    }
}
