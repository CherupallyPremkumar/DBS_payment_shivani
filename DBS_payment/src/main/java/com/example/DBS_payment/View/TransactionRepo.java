package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends CrudRepository<Transaction,Integer> {
}
