package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable(), "MyThread");
        log("myThread.getState() = " + myThread.getState());
        log("\"myThread.start()\" = " + "myThread.start()");
        myThread.start();
        Thread.sleep(1000);
        log("myThread.getState() = " + myThread.getState());
        Thread.sleep(4000);
        log("myThread.getState() = " + myThread.getState());
        log("end");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                log("start");
                log("myThread.getState() = " + Thread.currentThread().getState());
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.getState() = " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
