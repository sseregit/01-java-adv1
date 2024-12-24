package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                printWork("A", 1000);
            }
        }, "Thread-A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                printWork("B", 500);
            }
        }, "Thread-B");

        threadA.start();
        threadB.start();

    }

    private static void printWork(String content, int millis) {
        while (true) {
            try {
                log(content);
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
