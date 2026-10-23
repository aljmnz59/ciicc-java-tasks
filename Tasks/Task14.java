abstract class abstractClass {
    abstract void abstractMethod();
    void concreteMethod(){
        System.out.println("This is a concrete method");
    }
}

class B extends abstractClass{
    void abstractMethod() {
        System.out.println("B's implementation of abstractionMethod.");
    }
}

class C extends abstractClass{
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractionMethod");
    }
}

public class Task14 {
    static void main(String[] args) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
