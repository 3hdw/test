package pl.isbd.ticketbooker.services.customer.process;

import pl.isbd.ticketbooker.services.customer.models.CreateCustomerResponse;
import org.springframework.stereotype.Component;
import pl.isbd.ticketbooker.services.customer.models.CreateCustomerRequest;

@Component
public class CustomerProcess {
    public CreateCustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest){
        CreateCustomerResponse createCustomerResponse = new CreateCustomerResponse();
        createCustomerResponse.setName(createCustomerRequest.getName());
        createCustomerResponse.setSurname(createCustomerRequest.getSurname());
        createCustomerResponse.setStatus("TESTOWY");
        return createCustomerResponse;
    }
}
