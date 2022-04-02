package com.datortehnika.datortehnikas_sistema.service;
//TODO: Add comments
import com.datortehnika.datortehnikas_sistema.appUser.AppUser;
import com.datortehnika.datortehnikas_sistema.repository.userRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class userService implements UserDetailsService {
    private final userRepo userRepo;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findByEmail(email).orElseThrow(()-> new UsernameNotFoundException("User with email " + email + " not found!"));
    }
    public String signUpUser(AppUser appUser) {
        boolean userExists = userRepo.findByEmail(appUser.getEmail())
                .isPresent();
        if (userExists) {
            throw new IllegalStateException("Email already taken!");
        }
        String encodedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());
        appUser.setPassword(encodedPassword);
        userRepo.save(appUser);
        return "It works!";
    }
}
