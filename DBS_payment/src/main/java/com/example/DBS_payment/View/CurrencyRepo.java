package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Currency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepo extends CrudRepository<Currency,String> {
}
