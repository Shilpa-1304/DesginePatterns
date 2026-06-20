package com.ldd.design_patterns.StructuralDesignPattern.Adaptor;

import com.ldd.design_patterns.StructuralDesignPattern.Adaptor.Vendors.SinchClient;
import com.ldd.design_patterns.StructuralDesignPattern.Adaptor.VendorsAdaptors.SinchAdaptor;

public class NotificationClient {
    public static void main(String[] args) {
        NotificationService service=new SinchAdaptor(new SinchClient());
        service.sendMsg("12345657587","Send this msg");
    }
}
