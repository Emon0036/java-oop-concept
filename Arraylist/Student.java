public class Student implements Comparable<Student> {

    String name;
    int roll;
    int age;

    public Student(String name , int roll , int age) {
        this.name = name ;
        this.roll = roll;
        this.age = age;
    }

    public int compareTo(Student st){
        return this.age - st.age;

    }
}
