package RunnableThread;

public class RunnableMain {

    public static void main(String args[])
    {
        // threadRunnable th_run=new threadRunnable();
        Thread thread1 =new Thread(new threadRunnable()); // instead of creating object we directly pass the class 
        Thread thread2 =new Thread(new threadRunnable());

        thread1.start();
        thread2.start();


    }
    
}
