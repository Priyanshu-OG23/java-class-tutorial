package polymorphism;

public class functionOverriding {


    void add(int a, int b)
    {
        System.out.println(a+b);
        
    }


    
}
class child extends functionOverriding
{
    void add(int a,int b)
    {
        System.out.println("since method overriding is called it will exectue the overrided code ");
        System.out.println(a*b);
    }
}
