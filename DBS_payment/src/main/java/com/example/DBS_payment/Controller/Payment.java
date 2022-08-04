package com.example.DBS_payment.Controller;

import com.example.DBS_payment.Entity.Customer;
import com.example.DBS_payment.Service.CustomerService;
import com.example.DBS_payment.View.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Payment {
@Autowired
    private CustomerService customerService;
    @Autowired
 private CustomerRepo customerRepo;

    @PostMapping(value = "/use")
    public Customer PostUser(@RequestBody Customer user) {
        System.out.println("hello");
        return customerService.postdata(user);
    }
    @GetMapping("/users")
    public List<Customer> getAllUser() {
        List user= customerRepo.findAll();
        if(user.isEmpty()){
            System.out.println("no file Allvailbe");
        }
        System.out.println(user);
      return this.customerService.getAllUSers();
    }
@GetMapping("/user/{customerId}")

      Optional<Customer> getOneUser(@PathVariable Integer oneUser){
    System.out.println(customerRepo.findById(oneUser));
        return customerService.getOneUser(oneUser);
      }
}
