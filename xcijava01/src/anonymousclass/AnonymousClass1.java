package anonymousclass;


interface A {
    public void abc();
}

class B implements A{
    public void abc() {
        System.out.println("입력매개변수 전달");
    }
}

class C {
    void cde(A a) {
        a.abc();
    }
}

public class AnonymousClass1 {
    public static void main(String[] args) {
        C c = new C();
        A a = new B();
        c.cde(a);
        c.cde(new B());
    }
}