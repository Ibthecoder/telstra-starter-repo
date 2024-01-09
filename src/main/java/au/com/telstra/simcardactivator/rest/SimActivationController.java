package au.com.telstra.simcardactivator.rest;

import au.com.telstra.simcardactivator.SimCardActivator;
import au.com.telstra.simcardactivator.SimCardActuationHandler;
import au.com.telstra.simcardactivator.dao.DBBase;
import au.com.telstra.simcardactivator.dao.SimDdRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SimActivationController {

    //defined the SimCardActuationHandler:
    private SimCardActuationHandler simCardActuationHandler;

    private DBBase dBBase;

    @Autowired
    public SimActivationController(SimCardActuationHandler simCardActuationHandler,DBBase dBBase){
     this.simCardActuationHandler = simCardActuationHandler;
     this.dBBase = dBBase;
    }

    @PostMapping(value = "/activate")
    public void SimActivationRequest(@RequestBody SimCardActivator simCardActivator){
        var simActuationResult = simCardActuationHandler.actuate(simCardActivator);
    }
    @GetMapping(value = "/query")
    public SimCardActivator handleActivationRequest(@RequestParam Long simCardId) {
        return dBBase.querySimCard(simCardId);

    }

}
