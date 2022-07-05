package salon.salon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salon.salon.models.Appointment;
import salon.salon.repositories.AppointmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServices {
    @Autowired
    private AppointmentRepository appointmentRepo;

    public Appointment addAppointment(Appointment s){
        return appointmentRepo.save(s);
    }

    public List<Appointment> getAll(){
        return appointmentRepo.findAll();
    }

    public Optional<Appointment> findById(Long id){
        return appointmentRepo.findById(id);
    }

    public void deleteById(Long id){
        appointmentRepo.deleteById(id);
    }
}
