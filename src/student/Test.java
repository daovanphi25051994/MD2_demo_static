package student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(111, "dao");
        Student student2 = new Student(222, "van");
        Student student3 = new Student(333, "phi");
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        Student.changeCollege();
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
    }
}
