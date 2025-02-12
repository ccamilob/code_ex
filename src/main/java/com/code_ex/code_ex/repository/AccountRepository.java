package com.code_ex.code_ex.repository;

import com.code_ex.code_ex.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    private final List<Account> accounts = new ArrayList<>();
    private long nextId = 1l;

    public Account save(Account account) {
        account.setId(nextId++);
        accounts.add(account);
        return account;
    }

    public List<Account> findAll() {
        return accounts;
    }

    public Optional<Account> findById(long id) {
        return accounts.stream().filter(a -> a.getId() == id).findFirst();
    }

    public List<Account> findByOwnerName(String ownerName) {
        return accounts.stream().filter(a -> a.getOwnerName().equals(ownerName)).toList();
    }
}
