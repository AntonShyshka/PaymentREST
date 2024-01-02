package com.kronus.paymentrest.controllers;

import java.util.UUID;
import java.util.logging.*;

import com.kronus.paymentrest.OpenFeing.proxy.PaymentProxy;
import com.kronus.paymentrest.models.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    private static final Logger logger = Logger.getLogger(PaymentController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(@RequestHeader String requestID,
                                                 @RequestBody Payment payment) {
        logger.info("Received request with ID: " + requestID +
                "\nPayment amount: " + payment.getAmount());

        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestID", requestID)
                .body(payment);
    }
}