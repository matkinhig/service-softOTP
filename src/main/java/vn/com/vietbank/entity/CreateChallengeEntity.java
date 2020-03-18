package vn.com.vietbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "VBOTP_Challenge_Code")
public class CreateChallengeEntity extends RequestModel {
    @Column(name = "CustomerId")
    private String CustomerId;

    @Column(name = "CreditAccount")
    private String CreditAccount;

    @Column(name = "DebitAccount")
    private String DebitAccount;

    @Column(name = "Owner")
    private String Owner;

    @Column(name = "TransactionDate")
    private Date TransactionDate;

    @Column(name = "TransactionType")
    private String TransactionType;

    @Column(name = "Amount")
    private Number Amount;

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getCreditAccount() {
        return CreditAccount;
    }

    public void setCreditAccount(String creditAccount) {
        CreditAccount = creditAccount;
    }

    public String getDebitAccount() {
        return DebitAccount;
    }

    public void setDebitAccount(String debitAccount) {
        DebitAccount = debitAccount;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        TransactionDate = transactionDate;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public Number getAmount() {
        return Amount;
    }

    public void setAmount(Number amount) {
        Amount = amount;
    }
}
