public class ClassGradesTest {
    public static void main(String[] args) {
        int[] gradesArray = {87, 97, 84, 69, 76, 90, 100,75, 79, 89};
        GradeBook myGradeBook = new GradeBook("Java 203: Deeper look into Java", gradesArray);
        System.out.printf("Welcome to the gradebook for %n %s %n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
