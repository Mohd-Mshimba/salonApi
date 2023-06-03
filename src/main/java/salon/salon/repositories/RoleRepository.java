package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import salon.salon.models.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
