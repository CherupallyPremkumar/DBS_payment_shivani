package com.example.DBS_payment.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
@Entity
@Embeddable
@Table(name = "customerId")
public class CustomerUser {
    @Id

    private Integer userId;


    private String userName;

    @ElementCollection(targetClass=Customer.class)
   private List<Customer> customerId;

    private String userPassword;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Customer> getCustomerId() {
        return customerId;
    }

    public void setCustomerId(List<Customer> customerId) {
        this.customerId = customerId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
