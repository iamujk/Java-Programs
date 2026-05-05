public class instanceofusage {

    static class A {
        void methodA() {
            System.out.println("Method of A");
        }
    }

    static class B {
        void methodB() {
            System.out.println("Method of B");
        }
    }

    static class C {
        void methodC() {
            System.out.println("Method of C");
        }
    }

    static void callMethod(Object obj) {

        if (obj instanceof A) {
            System.out.println("I am in class A");
            ((A)obj).methodA();
        }
        else if (obj instanceof B) {
            System.out.println("I am in class B");
            ((B) obj).methodB();
        }
        else if (obj instanceof C) {
            System.out.println("I am in class C");
            ((C) obj).methodC();
        }
    }

    public static void main(String[] args) {

        A obj1=new A();
        callMethod(obj1);
        callMethod(new B());
        callMethod(new C());
    }
}
