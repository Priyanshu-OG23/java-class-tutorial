package encapsulation;

public class acessEncapsulation {

    public static void main(String args[])
    {

        // object created of the ecapsulation class 
        encapsulation1 obj1=new encapsulation1();




        // here getEars method is called and we are displaying the private variable value 
        int displayingPrivateVar=obj1.getEars();
        System.out.println(displayingPrivateVar);


        // here setEars method is called and we are overwritting the  inital value in which is set in ears varirbale

        obj1.setEars(19);

        System.out.println(obj1.eyes);




    }
    
}
