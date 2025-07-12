package polymorphism;

public class functionOverloading {

    int add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
        return c;

    }


    
}
class child1 extends functionOverloading{
    int add(int a, int b , int c)
    {
        System.out.println(a+b+c);
        return a+b+c;

    }
}

