package abstraction;

abstract class ClassAbstract {

    abstract void myMethod();
    
}

class child extends ClassAbstract
{
    void myMethod()
    {
        System.out.println("this is an abstract method which is implemented by another method ");
    }

}
