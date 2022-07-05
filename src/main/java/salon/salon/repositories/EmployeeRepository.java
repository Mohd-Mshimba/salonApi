package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import salon.salon.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
