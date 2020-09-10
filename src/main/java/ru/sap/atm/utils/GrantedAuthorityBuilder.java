package ru.sap.atm.utils;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import ru.sap.atm.model.Role;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class GrantedAuthorityBuilder {

    public static Collection<? extends GrantedAuthority> build(Role role) {
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.getName()));
        return authorities;
    }

    public static Collection<? extends GrantedAuthority> build(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
