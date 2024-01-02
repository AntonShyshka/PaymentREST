package com.kronus.paymentrest.controllers;

import com.kronus.paymentrest.OpenFeing.proxy.PaymentProxy;
import com.kronus.paymentrest.models.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentProxyController {
    private final PaymentProxy paymentProxy;

    public PaymentProxyController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        String requestID = UUID.randomUUID().toString();
        return paymentProxy.createPayment(requestID, payment);
    }
}
