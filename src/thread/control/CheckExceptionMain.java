package thread.control;

import util.ThreadUtils;

public class CheckExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() /*throws Exception*/ {
//            throw new Exception();
        }
    }
}
