package com.example.DBS_payment.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.convert.DataSizeUnit;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
@Entity
@Embeddable
@Table(name = "customer")
public class Customer  {
    @Id

    private Integer customerId;


    private String accountHolderName;

    private Boolean overDraftFlag;

    private Integer clearBalance;

    private String customerAddress;

    private String customerCity;

    private String customerType;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Boolean getOverDraftFlag() {
        return overDraftFlag;
    }

    public void setOverDraftFlag(Boolean overDraftFlag) {
        this.overDraftFlag = overDraftFlag;
    }

    public Integer getClearBalance() {
        return clearBalance;
    }

    public void setClearBalance(Integer clearBalance) {
        this.clearBalance = clearBalance;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
