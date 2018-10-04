package pl.isbd.ticketbooker.services.customer.controllers;

import pl.isbd.ticketbooker.services.customer.models.CreateCustomerRequest;
import pl.isbd.ticketbooker.services.customer.models.CreateCustomerResponse;
import pl.isbd.ticketbooker.services.customer.process.CustomerProcess;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerProcess customerProcess;

    CustomerController(CustomerProcess customerProcess){
        this.customerProcess=customerProcess;
    }

    @RequestMapping(path = "/createCustomer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return customerProcess.createCustomer(createCustomerRequest);
    }
}
