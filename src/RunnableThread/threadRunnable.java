package RunnableThread;

public class threadRunnable implements Runnable {

    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + "  "+ i);
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e)
            {
                System.out.println("thread was interrrupted ");
            }
        }
    }

  
    
}
