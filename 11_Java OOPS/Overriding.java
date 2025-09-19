class Parent {
    void fun() {
        System.out.println("Parent's fun");
    }
}

class Child extends Parent {
    @Override
    void fun() {
        System.out.println("Child's fun");
    }
}

class Grandchild extends Child {
    @Override
    void fun() {
        System.out.println("Grandchild's fun");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent p1 = new Child();
        Parent p2 = new Grandchild(); 
        p1.fun(); 
        p2.fun(); 
    }
}
