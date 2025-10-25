package com.example.solid.patterns;

import com.example.solid.patterns.SOLID.O.*;
import com.example.solid.patterns.SOLID.S.PaymentProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		PaymentProcessor paymentProcessor = new PaymentProcessor();

		paymentProcessor.processPayment(199);

		Payment payment = new MbankPayment();

		PaymentProcess paymentProcess = new PaymentProcess(payment);

		payment.pay(200);

		AreaCalculator calculator = new AreaCalculator(new Circle());
		calculator.calculate(5,6);
	}

}
