package au.com.telstra.simcardactivator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties(ignoreUnknown = true) means:
// indicates that any properties in the JSON:,
// input that do not match fields in the:,
// Java object should be ignored:.
public class SimActuationResult {

    //defined field for the SimActuationResult:
    private boolean success;

    //constructor:
    public SimActuationResult(){

    }

    public SimActuationResult(boolean success){
      this.success = success;
    }

    //getters:
    public boolean getSuccess(){
       return success;
    }

    //setters:
    public  void setSuccess(boolean success){
        this.success = success;
    }

    //toString:
    @Override
    public String toString() {
        return "SimActuationResult{" +
                "success=" + success +
                '}';
    }


}
