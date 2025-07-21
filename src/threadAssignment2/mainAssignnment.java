package threadAssignment2;

public class mainAssignnment {

    public static void main(String args[]) throws InterruptedException {

        assignmentThread2 evenThread = new assignmentThread2(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " number is even");
                } else {
                    System.out.println(i + " number is odd");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        assignmentThread2 oddThread = new assignmentThread2(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " number is odd");
                } else {
                    System.out.println(i + " number is even");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
