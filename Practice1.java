/*
A[10] says hello.
B[20] says hello.
null[20] says hello.
null[0] says hello.
A[10] says hello.
B[0] says hello.


*/



import java.util.*;

public class Main {
  public static class Person {
    int age;
    String name;

    public void sayHi(){
      System.out.println(name + "[" + age + "] says hello.");
    }
  }

  public static void main(String[] args) {
    // Write your code here
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "A";

    Person p2 = new Person();
    p2.age = 20;
    p2.name = "B";

    p1.sayHi();
    p2.sayHi();
    swap(p1, p2);
    p1.sayHi();
    p2.sayHi();

  }

  public static void swap(Person p1, Person p2){
    int tage = p1.age;
    p1.age = p2.age;
    p2.age = tage;

    String tname = p1.name;
    p1.name = p2.name;
    p2.name = tname;

    p1.sayHi();
    p2.sayHi();
  }
}
