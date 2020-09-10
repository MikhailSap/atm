package ru.sap.atm.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.sap.atm.model.Role;
import ru.sap.atm.model.User;
import ru.sap.atm.repo.UserRepo;
import ru.sap.atm.utils.GrantedAuthorityBuilder;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {
    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.getOne(id);
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void updateUser(User user) {
        saveUser(getUserById(user.getId()));
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepo.findByLogin(name)
                .orElseThrow(() -> new UsernameNotFoundException("No user with such name"));
        return new org.springframework.security.core.userdetails.User(user.getLogin(),
                user.getPincode(),
                GrantedAuthorityBuilder.build(user.getRole()));
    }
}
