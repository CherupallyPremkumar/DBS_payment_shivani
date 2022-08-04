package com.example.DBS_payment.Service;

import com.example.DBS_payment.Entity.Customer;
import com.example.DBS_payment.View.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private Customer customer;
    @Autowired
    private CustomerRepo customerRepo;

    public Customer postdata(Customer name) {
        System.out.println("hi");
        return customerRepo.save(name);
    }



    public List<Customer> getAllUSers() {

        List user= customerRepo.findAll();
        if(user.isEmpty()){
            System.out.println("no file Allvailbe");
        }
        return user;
    }

    public Optional<Customer> getOneUser(Integer oneUser) {
        return customerRepo.findById(oneUser);
    }
}
