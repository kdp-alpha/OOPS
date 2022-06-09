class Animal{
    void eat(){
        System.out.println("I Am Eating");
    }
}

class singleInheritance extends Animal
{
    void Dog(){
        System.out.println("I am Dog");
    }
    public static void main(String[] args) {
          singleInheritance sb = new singleInheritance();
          sb.Dog();
          sb.eat();  
    }
}
