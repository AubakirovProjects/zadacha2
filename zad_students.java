abstract class Student {
    protected String fullName;
    protected int course;
    protected double lastExamMark;

    public Student(String fullName, int course, double lastExamMark) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamMark = lastExamMark;
    }

    abstract void writeExam();
}

class IUStudent extends Student {

    public IUStudent(String fullName, int course, double lastExamMark) {
        super(fullName, course, lastExamMark);
    }

    @Override
    void writeExam() {
        System.out.println("Студент " + course + " курса факультета информационных технологий, " + fullName + ", пишет экзамен.");
    }
}

class MathStudent extends Student {

    public MathStudent(String fullName, int course, double lastExamMark) {
        super(fullName, course, lastExamMark);
    }

    @Override
    void writeExam() {
        System.out.println("Студент " + course + " курса математического факультета, " + fullName + ", пишет экзамен.");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Иван Иванов", 2, 4.5);
        Student mathStudent = new MathStudent("Анна Смирнова", 3, 5.0);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}
