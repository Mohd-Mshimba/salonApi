package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import salon.salon.models.Documents;

public interface DocumentsRepository extends JpaRepository<Documents,Long> {
}
