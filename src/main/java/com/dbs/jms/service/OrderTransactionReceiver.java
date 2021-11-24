package com.dbs.jms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.dbs.jms.model.OrderTransaction;
import com.dbs.jms.repository.OrderTransactionRepository;

@Component
public class OrderTransactionReceiver {

	private static final Logger log = LoggerFactory.getLogger(OrderTransactionReceiver.class);

	@Autowired
	private final OrderTransactionRepository transactionRepository;

	public OrderTransactionReceiver(OrderTransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	private int count = 1;

	@JmsListener(destination = "OrderTransactionQueue", containerFactory = "myFactory")
	public void receiveMessage(OrderTransaction transaction) {
		log.info("<" + count + "> Received <" + transaction + ">");
		count++;
		transactionRepository.save(transaction);
	}
}
