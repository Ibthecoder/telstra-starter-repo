package au.com.telstra.simcardactivator;

import au.com.telstra.simcardactivator.dao.SimDdRecord;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@JsonIgnoreProperties(ignoreUnknown = true)
@SpringBootApplication
public class SimCardActivator {

    public static void main(String[] args) {
        SpringApplication.run(SimCardActivator.class, args);
    }

    //defined field for the SimActivation:
    private String iccid;
    private String customerEmail;

    private boolean Active;

    //constructor:
    public SimCardActivator(){

    }

    public SimCardActivator(String iccid,String customerEmail,boolean active){
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.Active = active;

    }

    public SimCardActivator( SimDdRecord simDBRecord) {
        this.iccid = simDBRecord.getIccid();
        this.customerEmail = simDBRecord.getCustomerEmail();
        this.Active = simDBRecord.getActive();
    }

    //getters:
    public String getIccid(){
        return iccid;
    }

    public  String getCustomerEmail(){
        return customerEmail;
    }

    public boolean getActive(){
        return Active;
    }


    //setters:
    public  void setIccid(String iccid){
        this.iccid = iccid;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setActive(boolean active) {
        this.Active = active;
    }

    //toString:


    @Override
    public String toString() {
        return "SimCardActivator{" +
                "iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", Active=" + Active +
                '}';
    }
}
