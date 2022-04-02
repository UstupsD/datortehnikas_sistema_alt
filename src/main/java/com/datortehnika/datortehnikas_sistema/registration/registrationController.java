package com.datortehnika.datortehnikas_sistema.registration;
//TODO: Add comments
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/register")
@AllArgsConstructor
public class registrationController {
    private registrationService registrationService;
    @PostMapping
    public String register(@RequestBody registrationRequest request){
        return registrationService.register(request);
    }
}
