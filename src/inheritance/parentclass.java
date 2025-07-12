package inheritance;

public class parentclass {

    int eyes=2;
    int ears=2;

    // method 
    void run()
    {
        System.out.println("parents can run ");
    }
    
}

// creating a child class 

class child extends parentclass
{
    void dance()
    {
        System.out.println("child can dance  !");
    }
}
