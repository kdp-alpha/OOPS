class A{
    void showA(){
        System.out.println("I am A");
    }
}
class B extends A{
    void showB(){
        System.out.println("I am B");
    }
    
}
class C extends A{
    void showC(){
        System.out.println("I am C");
    }
    public static void main(String[] args) {
        C sc = new C();
        sc.showC();
        sc.showA();
        B sb = new B();
        sb.showB();
        sb.showA();

    }
}
