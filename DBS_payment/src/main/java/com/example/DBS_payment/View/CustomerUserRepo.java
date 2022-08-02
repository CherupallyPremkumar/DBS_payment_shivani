package com.example.DBS_payment.View;

import com.example.DBS_payment.Entity.CustomerUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CustomerUserRepo extends CrudRepository<CustomerUser,Integer> {
}
