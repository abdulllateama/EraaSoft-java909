package threads;

public class TheThread extends Thread {
    private String threadName;

    public TheThread(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
                   exception.printStackTrace();
        }

        System.out.println(threadName + "is finished");
    }



    }












