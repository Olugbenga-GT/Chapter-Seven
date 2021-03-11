package com;

public class ExamScores {
    private String courseName;
    private  int [][] grades;


    public ExamScores(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void processGrades(){
        outputGrades();

        System.out.printf("%n%s %d%n%s  %d%n%n", "Lowest grade in this semester exam is:", getMinimum(), "Highest grade in this semester exam is:", getMaximum());

        outputBarChart();
    }

    public int getMinimum(){
        int lowGrade = grades[0][0];
        for(int[] grade : grades){
            for(int studentGrade: grade){
                if(studentGrade < lowGrade){lowGrade = studentGrade;}
            }
        }
        return  lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0][0];
        for(int[] grade : grades){
            for(int studentGrade : grade){
                if(studentGrade > highGrade){highGrade = studentGrade;}
            }
        }
        return  highGrade;
    }

    public double getAverage(int[] setOfGrades){
        int total = 0;

        for(int grade : setOfGrades){
            total += grade;

        }
            return  (double) total / setOfGrades.length;
    }

    public void outputBarChart(){
        System.out.println("Overall Grade distribution: %n");

        int[] frequency = new  int[11];
        for(int[] grade: grades){
            for(int studentGrade: grade){
                ++frequency[ studentGrade/ 10];
            }
        }

        for(int count = 0; count < frequency.length; count++){
            if(count == 10){ System.out.printf("%5d: ", 100); }
            else { System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9); }

            for(int star = 0; star < frequency.length; star++){System.out.println("*");}
            System.out.println();

        }
    }

    public void outputGrades(){
        System.out.printf("The grades are: %n%n");
        System.out.println("                   ");

        for(int test = 0; test < grades[0].length; test++){
            System.out.printf("            Test %d ", test + 1);
        }

        System.out.println("Average");
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %02d", student+1);
            for(int test: grades[student]){
                System.out.printf("%9d", test);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%12.2f %n", average);
        }

    }
}
