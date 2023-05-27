package salon.salon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.Appointment;
import salon.salon.models.Appointment;
import salon.salon.services.AppointmentServices;
import salon.salon.services.AppointmentServices;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("api/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentServices appointmentService;

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment s){
        return appointmentService.addAppointment(s);
    }

    @GetMapping
    public List<Appointment> getAll(){
        return appointmentService.getAll();
    }

    @GetMapping("/getCustById/{id}")
    public List<Appointment> getACustById(@PathVariable("id") Long id){
        return appointmentService.getCustById(id);
    }

    @GetMapping("/getCustByApp/{email}")
    public List<Appointment> getACustByEmail(@PathVariable("email") String email){
        return appointmentService.getCustByEmail(email);
    }

    @GetMapping("/{id}")
    public Optional<Appointment> getById(@PathVariable Long id){
        return appointmentService.findById(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@RequestBody Appointment s,@PathVariable Long id){
        s.setId(id);
        return appointmentService.addAppointment(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        appointmentService.deleteById(id);
    }
}