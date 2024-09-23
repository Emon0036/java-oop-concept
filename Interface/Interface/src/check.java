
interface a1{
    int x=8;
    void f1();//I cannot make body of this method
    static void f2(){
        System.out.println(x);
    }
}

interface a2 extends a1{
    int y=2;
    void f3();
}

class c implements a2{
    int x =6;

    public void f1(){
        System.out.println(x);
    }
   public void f3(){
        System.out.println(y);
    }
}











public class check {
    public static void main(String[] args) {
//        System.out.println(a2.y);
       c C = new c();
        System.out.println(C.x);
//        C.f3();
         //a2.f2(); // we cannot call static method call without it's own locration

    }
}
