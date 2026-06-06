package com.ldd.design_patterns.SingletonPattern;
//NOTE: Singleton Pattern For Multi Threaded Env with Double Checked Locking

public class DoubleCheckedLockingLogger {
    //NOTE: Without volatile, JVM instruction reordering may expose a partially constructed object to another thread.
    private static volatile DoubleCheckedLockingLogger logger;

    private DoubleCheckedLockingLogger(){}

    public static DoubleCheckedLockingLogger getInstance() {

        if (logger == null) {          // First Check

            synchronized (DoubleCheckedLockingLogger.class) {

                if (logger == null) {  // Second Check
                    logger = new DoubleCheckedLockingLogger();
                }
            }
        }
        return logger;
    }
}
