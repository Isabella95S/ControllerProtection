package com.develhope.ControllerProtection.auth;

import com.develhope.ControllerProtection.models.Role;
import com.develhope.ControllerProtection.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DatabaseUserDetails implements UserDetails {

    private User user;

    public DatabaseUserDetails(User user)  {
        this.user = user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet();
        for (Role role : user.getRoles()) {
            SimpleGrantedAuthority auth = new SimpleGrantedAuthority(role.getName());
            authorities.add(auth);

        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUser_name();
    }
}
