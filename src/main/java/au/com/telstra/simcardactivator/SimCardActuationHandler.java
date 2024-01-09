package au.com.telstra.simcardactivator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class SimCardActuationHandler {

    //defined restTemplate:
    private final RestTemplate restTemplate ;
    private final String incentiveApiUrl;


    public SimCardActuationHandler(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
        this.incentiveApiUrl = "http://localhost:8444/actuate";
    }

    // defined the SimActuationResult here:

    public SimActuationResult actuate(SimCardActivator simCardActivator){
     return restTemplate.postForObject(incentiveApiUrl,simCardActivator, SimActuationResult.class);
    }
}
