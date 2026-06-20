package com.ldd.design_patterns.StructuralDesignPattern.Adaptor.VendorsAdaptors;

import com.ldd.design_patterns.StructuralDesignPattern.Adaptor.NotificationService;
import com.ldd.design_patterns.StructuralDesignPattern.Adaptor.Vendors.SinchClient;

public class SinchAdaptor implements NotificationService {
    private SinchClient sinch;
    public SinchAdaptor(SinchClient sc){
        this.sinch=sc;
    }

    @Override
    public void sendMsg(String mobile, String msg) {
        sinch.sendSms(mobile,msg);
    }
}
