package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Integer> {
    List<Customer> findAll();
}
