package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import salon.salon.models.Appointment;
import salon.salon.models.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value = "Select * from customer c, login l where c.email = l.username and c.email = ?1",nativeQuery = true)
    List<Customer> getLoginUser(String email);
}
