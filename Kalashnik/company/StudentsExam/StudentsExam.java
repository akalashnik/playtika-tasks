package com.company.StudentsExam;

import java.util.ArrayList;

public class StudentsExam {
    public static void main (String[] args) {
        studentGroup();
    }

    public static void studentGroup() {

        Student student1 = new Student("Fedde", "Legrand");
        Student student2 = new Student("Stephan", "Bodzin");
        Student student3 = new Student("Antony", "Romero");
        Student student4 = new Student("Nicky", "Slevin");
        Student student5 = new Student("Joachim", "Garraud");

        ArrayList studentGroup = new ArrayList();
        studentGroup.add(student1);
        studentGroup.add(student2);
        studentGroup.add(student3);
        studentGroup.add(student4);
        studentGroup.add(student5);

        average(passExam(studentGroup));
    }

    public static ArrayList<Student> passExam (ArrayList<Student> students) {
        ArrayList<Student> results = new ArrayList();

        for (int i = 0; i < students.size(); i++){
            students.get(i).setResult((int)(Math.random()*5));
            results.add(students.get(i));
        }
        for (int j = 0; j < results.size(); j++){
            System.out.println(results.get(j).getName() + " " + results.get(j).getLastName()  + " Exam result: " + results.get(j).getResult());
        }
        return results;
    }

    public static double average(ArrayList<Student> results) {
        int sum = 0;
        for(int k = 0; k < results.size(); k++ )
        {
            sum += results.get(k).getResult();
        }
        System.out.println("The average result throughout the group is: " + sum/results.size());
        return sum/results.size();
    }

    static class Student {
        private String name;
        private String lastName;
        private int result;


        public Student(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName () {
            return name;
        }

        public String getLastName () {

            return lastName;
        }

        public void setResult (int result) {

            this.result = result;
        }
        public int getResult () {
            return result;
        }


        @Override
        public String toString () {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", result=" + result +
                    '}';
        }
    }
}
