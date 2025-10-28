public class StudentDemo {
    public static void main(String[] args) {
        StudentId s1 = new StudentId("Abraham Yohannes");
        StudentId s2 = new StudentId("Bob Mendez");
        StudentId s3 = new StudentId("Kidus Bruk");
        
        System.out.println("Student 1 -> ID: " + s1.getStudentId() + ", Name: " + s1.getStudentName());
        System.out.println("Student 2 -> ID: " + s2.getStudentId() + ", Name: " + s2.getStudentName());
        System.out.println("Student 3 -> ID: " + s3.getStudentId() + ", Name: " + s3.getStudentName());
    }
}

