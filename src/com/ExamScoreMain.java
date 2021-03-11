package com;

public class ExamScoreMain {
    public static void main(String[] args) {

        int[][] gradesArray = { {87, 96, 70},
                                {68, 87, 90},
                                {94, 100, 90},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}
                              };

        ExamScores myStudentsScore = new ExamScores("PGG 405: Well Optimization & Simulation", gradesArray);
        System.out.printf("welcome tot he grade book of %n%s%n%n", myStudentsScore.getCourseName());
        myStudentsScore.processGrades();
    }
}
