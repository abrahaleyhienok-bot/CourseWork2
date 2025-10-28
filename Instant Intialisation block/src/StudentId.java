public class StudentId {
    private int studentId;
    private String studentName;
    private static int idCounter = 1000;
    {
        idCounter++;
        studentId = idCounter;
    }
}

