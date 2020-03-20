package student;

public class Student {
    private int rollno;
    private String name;
    private static String collage = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void changeCollege() {
        collage = "CodeGym";
    }

    public void showInfo() {
        System.out.println("name: " + this.name + " ; rollno: " + this.rollno + " ; college: " + this.collage);
    }

}
