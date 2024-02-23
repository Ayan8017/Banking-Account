package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.PrimitiveIterator;
@Data
@AllArgsConstructor
public class AccountDto {
    private Long Id;
    private String accountHolderName;
    private double balance;
}
