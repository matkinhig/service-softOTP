package vn.com.vietbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VBOTP_Contract")
public class CreateNewEntity extends RequestModel {
    @Column(name = "CustomerID")
    private String customerID;

    @Column(name = "AccountNumber")
    private String accountNumber;

    @Column(name = "Limit")
    private Number limit;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "SerialDeviceNumber")
    private String serialDeviceNumber;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(Number limit) {
        this.limit = limit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSerialDeviceNumber() {
        return serialDeviceNumber;
    }

    public void setSerialDeviceNumber(String serialDeviceNumber) {
        this.serialDeviceNumber = serialDeviceNumber;
    }
}
