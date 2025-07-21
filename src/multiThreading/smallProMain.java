package multiThreading;

public class smallProMain {

    public static void main(String args[])
    {
        Thread thread1=new Thread(new smallProject("ping "));
        Thread thread2=new Thread(new smallProject("pong"));

        System.out.println("Game start");
        thread1.start();
        thread2.start();


        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        


        System.out.println("Game over !");  // if i run these without join method then main thread will run completely and thread 1 and thread 2 will be still exectuing 
    }
    
}
