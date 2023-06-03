package salon.salon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salon.salon.models.Role;
import salon.salon.repositories.RoleRepository;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServices {
    @Autowired
    private RoleRepository roleRepository;

    public Role addRole(Role s){
        return roleRepository.save(s);
    }

    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    public Optional<Role> findById(Long id){
        return roleRepository.findById(id);
    }

    public void deleteById(Long id){
        roleRepository.deleteById(id);
    }
}