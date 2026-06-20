package com.ldd.design_patterns.StructuralDesignPattern.Facade;

import com.ldd.design_patterns.StructuralDesignPattern.Facade.Services.DeliveryService;
import com.ldd.design_patterns.StructuralDesignPattern.Facade.Services.NotificationService;
import com.ldd.design_patterns.StructuralDesignPattern.Facade.Services.PaymentService;
import com.ldd.design_patterns.StructuralDesignPattern.Facade.Services.RestaurentService;
import java.util.UUID;
public class OrderFacade {
    PaymentService paymentService;
    DeliveryService deliveryService;
    RestaurentService restaurentService;
    NotificationService notificationService;
    public OrderFacade() {
        paymentService = new PaymentService();
        deliveryService = new DeliveryService();
        restaurentService = new RestaurentService();
        notificationService = new NotificationService();
    }
    public String order(int amt,String mob){
        UUID orderId=UUID.randomUUID();
        if(paymentService.pay(amt,orderId.toString())){
            restaurentService.sendOrder(orderId.toString());
            deliveryService.assignRider(orderId.toString());
            notificationService.sendConfimation(mob,orderId.toString(),"Order Successful.");
        }
        else{
            notificationService.sendConfimation(mob,orderId.toString(),"Order Failed");
        }
        return orderId.toString();
    }
}
