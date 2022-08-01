package com.example.DBS_payment.Entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Size;
import java.util.List;
@Entity
public class Logger {
    @Id
    @Size(max = 11)
    private Integer loggerID;
    @Length(max = 11)
    private List<Customer> customerId;
    @Size(max = 11)
    private  Integer userId;
    @Size
    private  Integer employeeId;
    private  String screenName;
    private  String action;
    private  String ipAddress;


    public Integer getLoggerID() {
        return loggerID;
    }

    public void setLoggerID(Integer loggerID) {
        this.loggerID = loggerID;
    }

    public List<Customer> getCustomerId() {
        return customerId;
    }

    public void setCustomerId(List<Customer> customerId) {
        this.customerId = customerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}