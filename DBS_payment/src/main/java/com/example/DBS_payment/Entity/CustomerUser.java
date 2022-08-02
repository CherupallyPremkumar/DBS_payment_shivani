package com.example.DBS_payment.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
@Table(name = "customerId")
public class CustomerUser {
    @Id

    private Integer userId;


    private String userName;

    @OneToOne(targetEntity = Customer.class,cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_custom_customer_id")
    private List<Customer>  customer;


    private String userPassword;



}
