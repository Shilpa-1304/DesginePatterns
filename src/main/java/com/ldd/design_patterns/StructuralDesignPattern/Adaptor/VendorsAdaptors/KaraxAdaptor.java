package com.ldd.design_patterns.StructuralDesignPattern.Adaptor.VendorsAdaptors;

import com.ldd.design_patterns.StructuralDesignPattern.Adaptor.NotificationService;
import com.ldd.design_patterns.StructuralDesignPattern.Adaptor.Vendors.KaraxClient;

public class KaraxAdaptor implements NotificationService {
    private KaraxClient karaxClient;

    public KaraxAdaptor(KaraxClient karaxClient) {
        this.karaxClient = karaxClient;
    }

    @Override
    public void sendMsg(String mobile, String message) {
        karaxClient.triggerMessage(mobile, message);
    }
}
