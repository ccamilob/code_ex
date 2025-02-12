package com.code_ex.code_ex.service;

import com.code_ex.code_ex.model.Account;
import com.code_ex.code_ex.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(String ownerName, String accountNumber, Double balance) {
        Account account = new Account();
        account.setOwnerName(ownerName);
        account.setAccountNumber(accountNumber);
        account.setBalance(balance);
        return repository.save(account);
    }

    public List<Account> getAllAccounts() {
        return repository.findAll();
    }

    public Optional<Account> getAccountById(Long id) {
        return repository.findById(id);
    }

    public List<Account> getAccountsByOwnerName(String name) {
        return repository.findByOwnerName(name);
    }
}