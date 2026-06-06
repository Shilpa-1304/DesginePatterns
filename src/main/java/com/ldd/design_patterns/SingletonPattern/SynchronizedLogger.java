package com.ldd.design_patterns.SingletonPattern;
//NOTE: Singleton Pattern For Multi Threaded Env
public class SynchronizedLogger {
    private static SynchronizedLogger logger;

    private SynchronizedLogger(){}

      //NOTE:
     // Pros: Thread-safe (Only one thread can enter this method at a time) but
     // Con: Every call acquires a lock.
    public static synchronized SynchronizedLogger getInstance(){
        if(logger == null){ // Object is created only when needed (Lazy initilization)
            logger=new SynchronizedLogger();
        }
        return logger;
    }
}
