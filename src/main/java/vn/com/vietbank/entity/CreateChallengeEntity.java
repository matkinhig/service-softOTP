package vn.com.vietbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "VBOTP_Challenge_Code")
public class CreateChallengeEntity extends RequestModel {
    @Column(name = "CustomerId")
    private String customerId;

    @Column(name = "CreditAccount")
    private String creditAccount;

    @Column(name = "DebitAccount")
    private String debitAccount;

    @Column(name = "Owner")
    private String owner;

    @Column(name = "TransactionDate")
    private Date transactionDate;

    @Column(name = "TransactionType")
    private String transactionType;

    @Column(name = "Amount")
    private Number amount;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }
}
