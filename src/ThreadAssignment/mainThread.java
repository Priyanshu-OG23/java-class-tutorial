package ThreadAssignment;

import java.io.InterruptedIOException;

public class mainThread {
    public static void main(String args[]) throws InterruptedIOException,InterruptedException
    {
        threadAssignment thAssign=new threadAssignment();
        
        couterTask thread1=new couterTask(thAssign);
        couterTask thread2=new couterTask(thAssign);
        couterTask thread3=new couterTask(thAssign);
        
        thread1.start();
        thread2.start();
        thread3.start();



        
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("final thread " + thAssign.totalCount) ;

    }
    
}
