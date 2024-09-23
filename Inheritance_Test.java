class ClassA{
    int var1;
    String name;
    ClassA(){
        System.out.println("Constructor from Class A");
    }
    ClassA(int var1,String name){
        this.var1 =var1;
        this.name=name;

    }
    void methodA(){
        System.out.println("Class A variable 1 " + var1);
    }
    void show(){
        System.out.println("From Class A");
    }

}
class ClassB extends ClassA{
    float var1;
    float var2;
    ClassB(){
        System.out.println("Constructor from Class B");
    }
    ClassB(int var1,String name, float var){
        super(var1,name);//Class A constructor
        this.var1=var;
    }
    void methodB(){
        super.var1=12;
        System.out.println("Class B "+ var2);
        System.out.println("Class B Variable 1(float) "+ this.var1); //Class B variable
        System.out.println("Class B Variable 1(int) "+ super.var1); //Class A variable
    }
    void show(){
        super.show(); //Class A method
        System.out.println("From Class B");
    }
}
class ClassC extends ClassB{
    ClassC(){
        System.out.println("Constructor from Class C");
    }
}
public class Inheritance_Test {
    public static void main(String[] args) {
        ClassB objB = new ClassB(12,"abc",4.5f);
        ClassC objc = new ClassC();
        //ClassA objA = new ClassA();
        objB.var1 = 5.5f;
       // objA.var1= 10;
        //objB.methodB();
       // objB.show();
        //objA.methodA();
    }
}
