package com.datortehnika.datortehnikas_sistema.registration;

import com.datortehnika.datortehnikas_sistema.appUser.AppUser;
import com.datortehnika.datortehnikas_sistema.appUser.AppUserRole;
import com.datortehnika.datortehnikas_sistema.service.userService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
//TODO: Add comments
@Service
@AllArgsConstructor
public class registrationService {
    private final userService userService;
    private emailValidator emailValidator;
    public String register(registrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail) {
            throw new IllegalStateException("Email not valid!");
        }
        return userService.signUpUser(
                new AppUser(
                    request.getEmail(),
                    request.getPassword(),
                    request.getFirstName(),
                    request.getLastName(),
                    request.getJobTitle(),
                    AppUserRole.USER
                )
        );
    }
}
