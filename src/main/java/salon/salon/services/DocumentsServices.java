package salon.salon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salon.salon.models.Documents;
import salon.salon.repositories.DocumentsRepository;

import java.util.List;
import java.util.Optional;

@Service

public class DocumentsServices {
    @Autowired
    private DocumentsRepository documentsRepository;

    public Documents addDocuments(Documents s){
        return documentsRepository.save(s);
    }

    public List<Documents> getAll(){
        return documentsRepository.findAll();
    }

    public Optional<Documents> findById(Long id){
        return documentsRepository.findById(id);
    }

    public void deleteById(Long id){
        documentsRepository.deleteById(id);
    }
}