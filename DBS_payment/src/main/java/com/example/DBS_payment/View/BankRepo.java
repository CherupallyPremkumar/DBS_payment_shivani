package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends CrudRepository<Bank, String> {
}
