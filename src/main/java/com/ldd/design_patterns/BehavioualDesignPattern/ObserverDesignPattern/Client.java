package com.ldd.design_patterns.BehavioualDesignPattern.ObserverDesignPattern;

public class Client {
    public static void main(String[] args) {
        InstagramInfluencer influencerA=new InstagramInfluencer();
        Subscriber chintu=new Follower("Chintu");
        Subscriber sam=new Follower("Sam");
        influencerA.addSubscribers(chintu);
        influencerA.addSubscribers(sam);
        influencerA.notifySubscribers();
    }
}
