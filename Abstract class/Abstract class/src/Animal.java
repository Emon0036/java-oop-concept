public class Animal {
    int a;
    double c;
    void d(){
        System.out.println("I'm sorry baby");
    }
}
class dog extends Animal{
    void d(){
        System.out.println("I'm sorry babu");
    }

}

abstract  class cinema extends Animal{
    public cinema(){
        System.out.println("Do you want to watch movie with me?");
        void c(){
            System.out.println("I'm sorry babu");
        }

    }
}

class work {
    public static void main(String[] args) {
        Animal a = new Animal();
        a = new dog();
        a.d();

        cinema c = new cinema();

        c.c();



    }
}


