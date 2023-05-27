package salon.salon.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import salon.salon.models.Login;
import salon.salon.repositories.LoginRepository;

import java.util.Optional;

@Service

public class LoginServices {
    @Autowired
    private LoginRepository loginRepository;
    public Login addUser(Login s){
        return loginRepository.save(s);
    }

    public Login getAll(String username, String password){
        Optional <Login>  userList = loginRepository.getUser(username, password);
        if (userList.isPresent()) {
            return userList.get();
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"User Not Found");
        }
    }

}