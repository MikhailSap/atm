package ru.sap.atm.policy;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sap.atm.model.User;
import ru.sap.atm.service.UserService;

@Service
public class DepositWithdrawServicePolicyImpl implements DepositWithdrawServicePolicy {
    private UserService userService;

    @Override
    @Transactional
    public void deposit(Long userId, Long mount) {
        User user = userService.getUserById(userId);
        user.setScore(user.getScore() + mount);
        userService.updateUser(user);
    }

    @Override
    @Transactional
    public void withdraw(Long userId, Long mount) {
        User user = userService.getUserById(userId);
        user.setScore(user.getScore() - mount);
        userService.updateUser(user);
    }
}
