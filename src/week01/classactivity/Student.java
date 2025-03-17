package week01.classactivity; 




public class Student extends Person {
    private String studentId;
    private double gpa;
    
    public Student(int id, String name, int age, String studentId, double gpa) {
        super(id, name, age);  // Call parent class constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public double getGpa() {
        return gpa;
    }
}
