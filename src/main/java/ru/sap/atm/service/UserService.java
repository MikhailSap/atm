package ru.sap.atm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.sap.atm.model.User;

public interface UserService extends UserDetailsService {
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
}
