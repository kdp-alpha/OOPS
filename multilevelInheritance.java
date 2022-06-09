class Animal{
    void eat(){
        System.out.println("I Am Eating");
    }
}

class Dog extends Animal
{
    void Dog(){
        System.out.println("I am Dog");
    }
    
}
class multilevelInheritance extends Dog {

    void cat(){
        System.out.println("I am Cat");
    }
    public static void main(String[] args) {
        multilevelInheritance sb = new multilevelInheritance();
        sb.cat();
        sb.Dog();
        sb.eat();  
  }
}

//multilevel inheritance inherits the property of Dog 
//dog inherits the properties of animal classs
