//                    Instance of
// It is an operator ,it will check weather the object belongs to class hierarchy or not,if it belong,it will return true else it will return false.

// Syntax:{
//     if(a1 instanceof Animal)
//     a1.noise();
// }

class Animal
{
    void noise()
    {
        System.out.println("some noise");
    }
}
class Cat extends Animal{
    void noise()
    {
        System.out.println("meow meoww");
    }
}
class Dog extends Animal
{
    void noise()
    {
        System.out.println("bowww bpwww");
    }
}
class Snake extends Animal
{
    void noise()
    {
        System.out.println("buss buss");
    }
}
class Stimulator
{
    static void ansim(Animal a1)
    {
        if(a1 instanceof Animal)
        a1.noise();
    }
}
public class Mainclass1
{
    public static void main(String[] args)
    {
        Cat c1=new Cat();
        Dog d1=new Dog();
        Snake s1=new Snake();
        Stimulator.ansim(s1);
    }
}

// 1. Animal is a parent class with method noise()
// 2. Cat, Dog, Snake are child classes (using extends)
// 3. Each child class overrides the noise() method
// 4. Same method name + different behavior = Method Overriding
// 5. Stimulator.ansim(Animal a1) takes parent reference
// 6. Parent reference can store child objects
// 7. a1.noise() is called inside the method
// 8. Method call depends on object at runtime
// 9. This is Runtime Polymorphism
// 10. instanceof check is not needed here
// 11. In main(), Snake object is passed
// 12. So Snake's noise() method executes
// 13. Final output is "buss buss"