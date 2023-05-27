package salon.salon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salon.salon.models.Appointment;
import salon.salon.repositories.AppointmentRepository;

import java.util.ArrayList;
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

    public List<Appointment> getCustById(Long id){
        return appointmentRepo.getCustById(id);
    }

    public List<Appointment> getCustByEmail(String email){
        List<Appointment> a = appointmentRepo.getCustByEmail(email);
        if(a.size() > 0){
            return a;
        }else{
            return new ArrayList<>();
        }
    }

    public Optional<Appointment> findById(Long id){
        return appointmentRepo.findById(id);
    }

    public void deleteById(Long id){
        appointmentRepo.deleteById(id);
    }
}
