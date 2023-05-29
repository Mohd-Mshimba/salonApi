package salon.salon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salon.salon.models.Appointment;
import salon.salon.models.Customer;
import salon.salon.repositories.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepo;

    public Customer addCustomer(Customer s){
        return customerRepo.save(s);
    }

    public List<Customer> getAll(){
        return customerRepo.findAll();
    }

    public List<Customer> getLoginUser(String email){
        List<Customer> a = customerRepo.getLoginUser(email);
        if(a.size() > 0){
            return a;
        }else{
            return new ArrayList<>();
        }
    }

    public Optional<Customer> findById(Long id){
        return customerRepo.findById(id);
    }

    public void deleteById(Long id){
        customerRepo.deleteById(id);
    }
}