package au.com.telstra.simcardactivator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        return "SimActivationRequest{" +
                "iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", Active=" + Active +
                '}';
    }

}
