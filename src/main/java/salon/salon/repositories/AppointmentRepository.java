package salon.salon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salon.salon.models.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
