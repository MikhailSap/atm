package ru.sap.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sap.atm.dto.UserDTO;
import ru.sap.atm.policy.DepositWithdrawServicePolicy;

@Controller
public class DepositWithdrawController {
    private DepositWithdrawServicePolicy depositWithdrawServicePolicy;

    public DepositWithdrawController(DepositWithdrawServicePolicy depositWithdrawServicePolicy) {
        this.depositWithdrawServicePolicy = depositWithdrawServicePolicy;
    }


    @PostMapping("deposit")
    public void deposit(UserDTO userDTO) {
        depositWithdrawServicePolicy.deposit(userDTO.getId(), userDTO.getMount());
    }

    @PostMapping("withdraw")
    public void withdraw(UserDTO userDTO) {
        depositWithdrawServicePolicy.withdraw(userDTO.getId(), userDTO.getMount());
    }
}
