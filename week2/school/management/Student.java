package week2.school.management;

import week2.school.Person;

public class Student extends Person {
    private int studentID;
    private String[] enrolledCourses;
    private double tuition;
    private static final double COST_PER_COURSE = 500;

    public Student(String name, int age, int studentID){
        super(name, age);
        this.studentID = studentID;
        this.enrolledCourses = new String[0];
        this.tuition = 0.0;
    }

    public void enrollCourses(String[] enrolledCourses){
        this.enrolledCourses = enrolledCourses;
    }

    public void enrolledCourses(String course){
        String[] newArr = new String[enrolledCourses.length + 1];
        newArr = enrolledCourses.clone();
        newArr[enrolledCourses.length] = course;
        this.enrolledCourses = newArr;
    }

    public double getTuition(){
        return this.tuition;
    }

    private void setTuition(double tuition){
        this.tuition = tuition;
    }

    public void calculateTuition(){
        double newTuition = this.enrolledCourses.length * COST_PER_COURSE;
        setTuition(newTuition);
    }
}
