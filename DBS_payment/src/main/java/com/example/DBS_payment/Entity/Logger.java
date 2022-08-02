package com.example.DBS_payment.Entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Table(name = "Logger")
public class Logger {
    @Id
    private Integer loggerID;


    @OneToOne(targetEntity = Customer.class ,cascade=CascadeType.ALL)
    @JoinColumn(name = "Fk_customer_id")
    private List<Customer>  customer;

    private  Integer userId;

    private  Integer employeeId;
    private  String screenName;
    private  String action;
    private  String ipAddress;



}
