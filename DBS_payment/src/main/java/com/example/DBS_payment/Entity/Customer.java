package com.example.DBS_payment.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.convert.DataSizeUnit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
@Entity
public class Customer {
    @Id
    @Size(max = 14)
    private String customerId;
    @Id
    @Length(max = 50)
    private String accountHolderName;

    private Boolean overDraftFlag;

    private Integer clearBalance;
    @Length(max = 100)
    private String customerAddress;
    @Length(max = 100)
    private String customerCity;
    @Size(max = 1)
    private String customerType;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
