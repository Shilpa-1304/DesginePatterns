package com.ldd.design_patterns.StructuralDesignPattern.Adaptor.Vendors;

public class SinchClient {
    public void sendSms(String phoneNo,String text){
        System.out.println("Sending via Sinch");
    }
}
