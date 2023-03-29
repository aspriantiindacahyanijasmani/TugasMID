// Asprianti Inda Cahyani J 13020210236
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0236 implements A,B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[] ) {
        Central0236 obj = new Central0236 ();
        System.out.println("main");
        obj.aaa();
    }
}