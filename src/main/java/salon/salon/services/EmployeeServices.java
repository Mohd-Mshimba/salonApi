package salon.salon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salon.salon.models.Employee;
import salon.salon.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepo;

    public Employee addEmployee(Employee s){
        return employeeRepo.save(s);
    }

    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> findById(Long id){
        return employeeRepo.findById(id);
    }

    public void deleteById(Long id){
        employeeRepo.deleteById(id);
    }
}