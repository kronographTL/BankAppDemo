package com.demo.bankapp.service.bankaccount;

import com.demo.bankapp.dao.BankAccountRepository;
import com.demo.bankapp.domainobject.AccountDO;
import com.demo.bankapp.model.CreateAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;
    @Override
    public AccountDO createAccount(CreateAccountRequest accountRequest) {
        AccountDO accountDO = AccountDO.builder()
                .customerId(accountRequest.getCustomerId())
                .emailId(accountRequest.getEmailId())
                .build();
        return bankAccountRepository.save(accountDO);
    }
}
