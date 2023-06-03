package salon.salon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.Role;
import salon.salon.services.RoleServices;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/roles")
public class RoleController {
    @Autowired
    private RoleServices roleServices;

    @PostMapping
    public Role addRole(@RequestBody Role s){
        return roleServices.addRole(s);
    }

    @GetMapping
    public List<Role> getAll(){
        return roleServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Role> getById(@PathVariable Long id){
        return roleServices.findById(id);
    }

    @PutMapping("/{id}")
    public Role updateRole(@RequestBody Role s,@PathVariable Long id){
        s.setId(id);
        return roleServices.addRole(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        roleServices.deleteById(id);
    }
}
