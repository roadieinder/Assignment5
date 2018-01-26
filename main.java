class Animal
{
void speak()
{System.out.println("growl");}
}
class Dog extends Animal
{
void speak()
{System.out.println("bark");}
}
class cat extends Animal
{
void speak()
{System.out.println("meow");}
}
class main
{
public static void main(String[] args)
{
Animal a=new Animal();
Dog d=new Dog();
cat c=new cat();
a.speak();
d.speak();
c.speak();
}
}


