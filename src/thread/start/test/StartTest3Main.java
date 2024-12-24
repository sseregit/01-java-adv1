package thread.start.test;

import util.MyLogger;

public class StartTest3Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        MyLogger.log("value: " + (i + 1));
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread = new Thread(runnable, "counter");
        thread.start();
    }

}
