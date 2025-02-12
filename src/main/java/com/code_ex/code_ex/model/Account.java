package com.code_ex.code_ex.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private long id;
    private String ownerName;
    private String accountNumber;
    private double balance;
}
