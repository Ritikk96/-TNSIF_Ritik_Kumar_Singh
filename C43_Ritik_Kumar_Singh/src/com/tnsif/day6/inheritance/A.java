
package com.tnsif.day6.inheritance;

public class A {
    void show() {
        System.out.println("hello i am a parent");
    }

    public static class B extends A {
        void demo() {
            System.out.println("i am a child");
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.demo();
        obj.show();
    }
}


//public class A {
//    public void show() {
//        System.out.println("hello i am a parent");
//    }
//
//    public class B extends A {
//        public void demo() {
//            System.out.println("i am a child");
//        }
//    }
//
//    public static void main(String[] args) {
//        A obj1 = new A();
//        B obj = obj1.new B();
//        obj.demo();
//        obj1.show();
//    }
//}
