package com.ldd.design_patterns.BehavioualDesignPattern.ObserverDesignPattern;

public class Follower implements Subscriber{
    String name;
    public Follower(String n){
        this.name=n;
    }
    @Override
    public void notifyObservors() {
        System.out.println("Notification received by "+this.name);
    }
}
