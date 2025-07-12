package Implementinterface;

import Implementinterface.introToInterface.InnerintroToInterface;

public class introToInterface {

    interface InnerintroToInterface {

        void display(); // abstract method declared 
    
        
    }

       
}
class child implements introToInterface.InnerintroToInterface
{
    public void display()  // implementation for abstract  class 
    {
        System.out.println("hello world ! this display method is displayed using interface ");
    }
}
