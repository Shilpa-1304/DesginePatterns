package com.ldd.design_patterns.CreationalDesignPattern.SingletonPattern;
/*
* This is the best approach for multi theraded singleton design pattern
* 1. Thread Safe  :  JVM guarantees class loading is thread-safe
* 2. Lazy Initialization : Holder class is loaded only when getInstance() is called
* 3. No volatile needed : No memory reordering issue
* 4. No Locking overhead : Faster than DCL
* */
public class HolderPatternLogger {
    private HolderPatternLogger logger;

    private HolderPatternLogger(){}

    private static class Holder{
        private static final HolderPatternLogger INSTANCE=new HolderPatternLogger();
    }
    public static HolderPatternLogger getInstance(){
        return Holder.INSTANCE;
    }
}
