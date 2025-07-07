public class Animal{
    int eyes=2;
    int ears=2;
    
    void makeNoise()
    {
        System.out.println("animals are making sound ");
    }

}
class anotherClass
{
    public static void  main(String args[])
    {
        // first object of the animal class 
        Animal dog=new Animal();
        System.out.println("eyes ="+ dog.eyes);
        System.out.println("eyes ="+ dog.ears);

        dog.makeNoise();

        // second  object of the animal class 

        Animal cat=new Animal();
        System.out.println("cat has  "+ cat.eyes+ " eyes ");
        System.out.println("cat has  "+ cat.ears+ " ears ");
        cat.makeNoise();
    }

}