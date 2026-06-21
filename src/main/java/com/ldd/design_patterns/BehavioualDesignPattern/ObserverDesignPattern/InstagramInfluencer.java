package com.ldd.design_patterns.BehavioualDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class InstagramInfluencer implements ChannelSubject{
    private List<Subscriber> subscriberList=new ArrayList<>();

    @Override
    public void addSubscribers(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscribers(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber s: subscriberList){
            s.notifyObservors();
        }
    }
}
