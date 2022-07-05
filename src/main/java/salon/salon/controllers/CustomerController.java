package salon.salon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.Customer;
import salon.salon.services.CustomerServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    private CustomerServices customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer s){
        return customerService.addCustomer(s);
    }

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer s,@PathVariable Long id){
        s.setId(id);
        return customerService.addCustomer(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        customerService.deleteById(id);
    }
}
