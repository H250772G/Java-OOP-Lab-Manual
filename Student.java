public class Student {

    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "Computer Science");

        student1.displayDetails();
    }
}