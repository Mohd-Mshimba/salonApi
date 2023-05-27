package salon.salon.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import salon.salon.models.Login;
import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Long> {
    @Query(value = "Select * from Login where  username=?1 AND password=?2",nativeQuery = true)
   Optional<Login> getUser(String username, String password);
}
