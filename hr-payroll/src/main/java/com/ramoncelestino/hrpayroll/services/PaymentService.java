package com.ramoncelestino.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.ramoncelestino.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("João", 200.0, days);
	}
}
