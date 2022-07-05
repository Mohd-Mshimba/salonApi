package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import salon.salon.models.ServiceRendered;

public interface ServiceRenderedRepository extends JpaRepository<ServiceRendered, Long> {
}
