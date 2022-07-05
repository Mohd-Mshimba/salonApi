package salon.salon.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.SalonService;
import salon.salon.models.SalonService;
import salon.salon.services.SalonServiceServices;
import salon.salon.services.SalonServiceServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/salonService")
public class SalonServiceController {
    @Autowired
    private SalonServiceServices salonServiceService;

    @PostMapping
    public SalonService addSalonService(@RequestBody SalonService s){
        return salonServiceService.addService(s);
    }

    @GetMapping
    public List<SalonService> getAll(){
        return salonServiceService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SalonService> getById(@PathVariable Long id){
        return salonServiceService.findById(id);
    }

    @PutMapping("/{id}")
    public SalonService updateSalonService(@RequestBody SalonService s, @PathVariable Long id){
        s.setId(id);
        return salonServiceService.addService(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        salonServiceService.deleteById(id);
    }
}