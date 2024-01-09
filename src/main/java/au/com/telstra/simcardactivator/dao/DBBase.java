package au.com.telstra.simcardactivator.dao;

import au.com.telstra.simcardactivator.SimActuationResult;
import au.com.telstra.simcardactivator.SimCardActivator;
import org.springframework.stereotype.Component;

@Component
public class DBBase {

    private final SimRepository simRepository;

    public DBBase(SimRepository simRepository){
      this.simRepository = simRepository;
    }

    //save-method:
    public void save(SimCardActivator simCardActivator, SimActuationResult actuationResult) {
        SimDdRecord simDBRecord = new SimDdRecord(simCardActivator, actuationResult);
        simRepository.save(simDBRecord);
    }

    public SimCardActivator querySimCard(long simCardId) {
        var simDBRecord = simRepository.findById(simCardId).orElse(null);
        if (simDBRecord == null) {
            return null;
        }
      return new SimCardActivator(simDBRecord);
    }
}
