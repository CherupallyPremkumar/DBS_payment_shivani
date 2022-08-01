package com.example.DBS_payment.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.List;
@Entity
public class CustomerUser {
    @Id
    @Length(max = 11)
    private Integer userId;
    @Id
    @Length(max = 100)
    private String userName;
    @Size(max = 11)
   private List<Customer> customerId;
    @Length(max = 100)
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
