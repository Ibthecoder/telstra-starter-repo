package au.com.telstra.simcardactivator.rest;

import au.com.telstra.simcardactivator.SimCardActivator;
import au.com.telstra.simcardactivator.SimCardActuationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimActivationController {

    //defined the SimCardActuationHandler:
    private SimCardActuationHandler simCardActuationHandler;

    @Autowired
    public SimActivationController(SimCardActuationHandler simCardActuationHandler){
     this.simCardActuationHandler = simCardActuationHandler;
    }

    @PostMapping(value = "/activate")
    public void SimActivationRequest(@RequestBody SimCardActivator simCardActivator){
        var simActuationResult = simCardActuationHandler.actuate(simCardActivator);
    }


}
