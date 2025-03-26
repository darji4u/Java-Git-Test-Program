public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData(){
        System.out.println("Student Name : "+name);
        System.out.println("Student Age :"+age);
    }

}
