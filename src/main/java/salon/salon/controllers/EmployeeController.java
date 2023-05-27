package salon.salon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.Employee;
import salon.salon.services.EmployeeServices;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee s){
        return employeeService.addEmployee(s);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee s,@PathVariable Long id){
        s.setId(id);
        return employeeService.addEmployee(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        employeeService.deleteById(id);
    }
}