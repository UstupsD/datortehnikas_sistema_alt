package com.datortehnika.datortehnikas_sistema.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
@Service
//TODO: Add comments
public class emailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return true;
    }
}
