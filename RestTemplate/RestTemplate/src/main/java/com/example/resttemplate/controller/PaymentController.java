package com.example.resttemplate.controller;

import com.example.resttemplate.model.Payment;
import com.example.resttemplate.proxy.PaymentsProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    PaymentsProxy paymentsProxy;

    public PaymentController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentsProxy.createPayment(payment);
    }
}
