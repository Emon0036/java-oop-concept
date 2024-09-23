

class Student{
    String student;
    String name;
    double grade;
    String email;
    public Student(){
        student = "Unknown";

    }
    public Student(String name , double grade , String email){
        this.name = name;
        this.grade = grade;
        this.email = email;
    }


    public Student(String student){
        this.student = student;
    }

    public String pri (){
        return student;
    }
}


public class Name {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("The name of the student:"+s.pri());
        Student s2 = new Student("Anik");
        System.out.println("The name of the student:"+s2.pri());
        Student[] s3 = new Student[3];
        s3[0] = new Student("Pitar" , 5 , "pitar5020@gmail.com");
        s3[1] = new Student("Danush" , 6 , "danush5020@gmail.com");
        s3[2] = new Student("Kalki" , 7 , "kalki5020@gmail.com");

        for(int i=0 ; i<s3.length ; i++){
            System.out.println(s3[i].name +" "+ s3[i].grade+" " +s3[i].email);
        }

    }
}
