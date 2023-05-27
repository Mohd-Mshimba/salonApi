package salon.salon.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salon.salon.models.Employee;
import salon.salon.models.Login;
import salon.salon.services.LoginServices;

@CrossOrigin
@RestController
@RequestMapping("/api/login")
public class LoginController {
@Autowired
    private LoginServices loginService;

    @PostMapping
    public Login addUser(@RequestBody Login s){
        return loginService.addUser(s);
    }

    @GetMapping("/{username}/{password}")
    public Login loginUser(@PathVariable String username, @PathVariable String password) {
        return loginService.getAll(username, password);
    }

}