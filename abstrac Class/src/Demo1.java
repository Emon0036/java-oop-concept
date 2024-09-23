public abstract class Demo1 {

    Demo1(){
        System.out.println("Cole aso na");
    }
    int x ,y;

    void f1(){

    }
}

class d2 extends Demo1{
    public void f1(){
        System.out.println("The value of a is:" + x);
    }
}
