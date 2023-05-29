package salon.salon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.Documents;
import salon.salon.services.DocumentsServices;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/documents")
public class DocumentsController {
    @Autowired
    private DocumentsServices documentsServices;

    @PostMapping
    public Documents addDocuments(@RequestBody Documents s){
        return documentsServices.addDocuments(s);
    }

    @GetMapping
    public List<Documents> getAll(){
        return documentsServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Documents> getById(@PathVariable Long id){
        return documentsServices.findById(id);
    }

    @PutMapping("/{id}")
    public Documents updateCustomer(@RequestBody Documents s,@PathVariable Long id){
        s.setId(id);
        return documentsServices.addDocuments(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        documentsServices.deleteById(id);
    }
}
