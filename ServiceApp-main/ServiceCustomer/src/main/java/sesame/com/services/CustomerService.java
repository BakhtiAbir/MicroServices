package sesame.com.services;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sesame.com.entities.Customer;

@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerService {
    @GetMapping("/customers/{id}")

    public Customer findCustomerById(@PathVariable(name="id") Long id);
}
