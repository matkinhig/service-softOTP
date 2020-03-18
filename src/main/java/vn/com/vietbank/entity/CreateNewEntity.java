package vn.com.vietbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VBOTP_Contract")
public class CreateNewEntity extends RequestModel {
    @Column(name = "CustomerID")
    private String CustomerID;

    @Column(name = "AccountNumber")
    private String AccountNumber;

    @Column(name = "Limit")
    private Number Limit;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @Column(name = "SerialDeviceNumber")
    private String SerialDeviceNumber;

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public Number getLimit() {
        return Limit;
    }

    public void setLimit(Number limit) {
        Limit = limit;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getSerialDeviceNumber() {
        return SerialDeviceNumber;
    }

    public void setSerialDeviceNumber(String serialDeviceNumber) {
        SerialDeviceNumber = serialDeviceNumber;
    }
}
