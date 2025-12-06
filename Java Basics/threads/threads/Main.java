package threads;



    public class Main {
        public static void main(String[] args) {
//  Task: Create a class that extends Thread, override run() method, and print "Hello from thread". Start the thread.

//            MyThread thread = new MyThread();
//            thread.start();
//            System.out.println(" thread is running");


// Task: Create a class that implements Runnable and prints the current thread name and a message.
//            MyRunnable myRunnable = new MyRunnable();
//            Thread thread = new Thread(myRunnable);
//            thread.start();



// Task: Print numbers 1 to 5 with a 1-second delay between each number using sleep().

//            for (int i = 1; i <= 5; i++) {
//                System.out.println(i);
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException exception) {
//                    exception.printStackTrace();
//                }
//            }


            TheThread thread1 = new TheThread("Thread 1");
            TheThread thread2 = new TheThread("Thread 2");
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            }catch (InterruptedException exception) {
                exception.printStackTrace();
            }















    }
}
