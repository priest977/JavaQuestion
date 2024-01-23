package com.company.Opps;

public class Main {
    public static void main(String[] args) {
//        Note Here
//                1. nafish => it is object reference.
//                2. left side of Student is called class;
//                3. right side of Student is called constructor.
        Student nafish = new Student("Nafish",30,"B.Tech");
        Subject subject = new Subject("Java" );
        Exam unitTest = new Exam("Unit Test",10,20);
        subject.addExam(unitTest);
        Exam finalTest = new Exam("Final Test: ",70,100);
        subject.addExam(finalTest);
        ReportCard nafishReportcard = new ReportCard(nafish);
        nafishReportcard.addSubject(subject);

        System.out.println("Nafish Report Card : "+nafishReportcard);


        Student rishabh = new Student("Rishabh",39,"B.Tech");
        Subject subjects = new Subject("Java" );
        Exam unitTests = new Exam("Unit Test",8,20);
        subject.addExam(unitTests);
        Exam finalTests = new Exam("Final Test: ",56,100);
        subject.addExam(finalTests);
        ReportCard rishabhReportCard = new ReportCard(rishabh);
        nafishReportcard.addSubject(subjects);

        System.out.println("Rishabh Report Card : "+rishabhReportCard);


    }
}
