class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void writeInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {

    String name;
    int age;

    public void printStudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.name = "shivansh";
        s1.age = 19;

        s1.printStudentInfo();
    }
}