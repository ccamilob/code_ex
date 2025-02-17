package com.code_ex.code_ex.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private long id;
    @NotBlank
    private String ownerName;
    private String accountNumber;
    private double balance;
}
