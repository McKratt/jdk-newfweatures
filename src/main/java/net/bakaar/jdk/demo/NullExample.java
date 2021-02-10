package net.bakaar.jdk.demo;

public class NullExample {

    //tag::nullExample[]
    public static void main(String[] args) {
        var b = new B(null);
        var c = new C(b);
        c.getB().getA().getNumber();//Will throw a NullPointerException
    }

    private static class A {
        private final Integer number;

        private A(Integer number) {
            this.number = number;
        }

        public Integer getNumber() {
            return number;
        }
    }

    private static class B {
        private final A a;

        private B(A a) {
            this.a = a;
        }

        public A getA() {
            return a;
        }
    }

    private static class C {
        private final B b;

        private C(B b) {
            this.b = b;
        }

        public B getB() {
            return b;
        }
    }
    //end::nullExample[]
}
