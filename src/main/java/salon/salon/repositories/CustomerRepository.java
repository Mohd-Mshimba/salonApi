package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salon.salon.models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
