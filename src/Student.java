public class Student {
    String name;
    int gpa;
    int age;

    Student(String name, int age, int gpa) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    void study() {
        System.out.println(name + " is studying");
    }

}
