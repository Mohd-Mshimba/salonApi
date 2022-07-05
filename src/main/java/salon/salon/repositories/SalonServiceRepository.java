package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import salon.salon.models.SalonService;

public interface SalonServiceRepository extends JpaRepository<SalonService,Long> {
}
