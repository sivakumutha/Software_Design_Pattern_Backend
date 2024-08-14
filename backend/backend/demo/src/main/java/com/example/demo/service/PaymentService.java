package com.example.demo.service;

import com.example.demo.model.Payment;
import com.example.demo.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {
    
    @Autowired
    private PaymentRepo paymentRepo;

    public Payment processPayment(Payment payment) {
        // Simulate payment processing and set status
        payment.setStatus("SUCCESS");
        return paymentRepo.save(payment);
    }

    public Optional<Payment> getPayment(Long id) {
        return paymentRepo.findById(id);
    }
}
