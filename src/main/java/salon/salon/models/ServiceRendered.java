package salon.salon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import salon.salon.controllers.EmployeeController;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "serviceRendered")
public class ServiceRendered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rendered_id")
    private Long id;
    private int service_extended_price;

    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Appointment appointment;
    @ManyToOne
    private SalonService services;
}
