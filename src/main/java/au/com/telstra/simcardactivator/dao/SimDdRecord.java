package au.com.telstra.simcardactivator.dao;

import au.com.telstra.simcardactivator.SimActuationResult;
import au.com.telstra.simcardactivator.SimCardActivator;

import javax.persistence.*;

@Entity
public class SimDdRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "simCardId", nullable = false)
    private Long SimCardId;
    @Column(name = "iccid", nullable = false)
    private String iccid;
    @Column(name = "customerEmail", nullable = false)
    private String customerEmail;
    @Column(name = "boolean", nullable = false)
    private boolean active;

    public SimDdRecord () {
    }

    public SimDdRecord (SimCardActivator simCardActivator, SimActuationResult actuationResult) {
        this.iccid = simCardActivator.getIccid();
        this.customerEmail = simCardActivator.getCustomerEmail();
        this.active = actuationResult.getSuccess();
    }

    public long getsimCardId() {
        return SimCardId;
    }

    public String getIccid() {
        return iccid;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public boolean getActive() {
        return active;
    }

    @Override
    public String toString() {
        return "SimDdRecord{" +
                "SimCardId=" + SimCardId +
                ", iccid=" + iccid +
                ", customerEmail='" + customerEmail + '\'' +
                ", active=" + active +
                '}';
    }
}
