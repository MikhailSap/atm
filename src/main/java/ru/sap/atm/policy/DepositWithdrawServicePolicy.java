package ru.sap.atm.policy;

public interface DepositWithdrawServicePolicy {
    void deposit(Long userId, Long mount);
    void withdraw(Long userId, Long mount);
}
