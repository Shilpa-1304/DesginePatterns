package com.ldd.design_patterns.CreationalDesignPattern.SingletonPattern;
//NOTE: Singleton Pattern For Single Threaded Env
public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
