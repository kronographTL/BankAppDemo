package com.demo.bankapp.mapper;

import com.demo.bankapp.domainobject.AccountDO;
import com.demo.bankapp.dto.AccountDTO;

public class AccountMapper {

    public static AccountDTO convertToAccountDTO(AccountDO accountDO) {
        AccountDTO accountDTO = AccountDTO.builder()
                .customerId(accountDO.getCustomerId())
                .emailAddress(accountDO.getEmailId())
                .accountNumber(accountDO.getAccountNumber())
                .accountBalance(accountDO.getAccountBalance())
                .build();
        return accountDTO;
    }
}
