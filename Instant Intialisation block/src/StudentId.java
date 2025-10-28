public class StudentId {
    private int studentId;
    private String studentName;
    private static int idCounter = 1000;
    {
        idCounter++;
        studentId = idCounter;
    }
    public StudentId(String name) {
        this.studentName = name;
    }
    public int getStudentId() {
        return studentId;
    }
}

