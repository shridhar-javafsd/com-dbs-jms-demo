package com.dbs.jms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.jms.model.OrderTransaction;

@Repository
public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Integer> {
}
