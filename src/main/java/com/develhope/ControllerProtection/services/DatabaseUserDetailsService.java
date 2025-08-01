package com.develhope.ControllerProtection.services;

import com.develhope.ControllerProtection.auth.DatabaseUserDetails;
import com.develhope.ControllerProtection.models.User;
import com.develhope.ControllerProtection.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DatabaseUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optional= userRepository.findByUsername(username);
        if (optional.isEmpty()) throw new UsernameNotFoundException("Utente non trovato") ;
        return new DatabaseUserDetails(optional.get());
    }
}
