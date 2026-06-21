package com.ldd.design_patterns.BehavioualDesignPattern.ObserverDesignPattern;

public interface ChannelSubject {
    public void addSubscribers(Subscriber subscriber);
    public void removeSubscribers(Subscriber subscriber);
    public void notifySubscribers();
}
