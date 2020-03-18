package vn.com.vietbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VBOTP_Transaction_Code")
public class SignransactionEntity extends RequestModel {
    @Column(name = "CustomerId")
    private String customerId;
    @Column(name = "SerialNumber")
    private String serialNumber;
    @Column(name = "ChallengeCode")
    private String challengeCode;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getChallengeCode() {
        return challengeCode;
    }

    public void setChallengeCode(String challengeCode) {
        this.challengeCode = challengeCode;
    }
}
