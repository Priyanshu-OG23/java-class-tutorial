package ThreadAssignment;

public class threadAssignment  
{
    int totalCount=0;

}

class couterTask extends Thread


{
    
    threadAssignment shared;

    // declaring constructor 
    public couterTask(threadAssignment shared)
    {
        this.shared=shared;
    }
     public void run()
     {
        for(int i=0;i<100;i++)
        {
            shared.totalCount++;
            try{
                Thread.sleep(10);

            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
     }

}
