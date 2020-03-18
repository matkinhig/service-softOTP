package vn.com.vietbank.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class RequestModel {
    @Id
    @Column(name = "RequestId")
    private String RequestId;

    @Column(name = "RequestDateTime")
    private Date RequestDateTime;

    @Column(name = "Function")
    private String Function;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Date getRequestDateTime() {
        return RequestDateTime;
    }

    public void setRequestDateTime(Date requestDateTime) {
        RequestDateTime = requestDateTime;
    }

    public String getFunction() {
        return Function;
    }

    public void setFunction(String function) {
        Function = function;
    }
}
