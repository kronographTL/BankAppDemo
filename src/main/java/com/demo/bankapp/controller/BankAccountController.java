package com.demo.bankapp.controller;

import com.demo.bankapp.domainobject.AccountDO;
import com.demo.bankapp.dto.AccountDTO;
import com.demo.bankapp.mapper.AccountMapper;
import com.demo.bankapp.model.CreateAccountRequest;
import com.demo.bankapp.service.bankaccount.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
@RequestMapping("/v1/account")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(CreateAccountRequest accountRequest){
        AccountDO accountDO = bankAccountService.createAccount(accountRequest);
        return new ResponseEntity<>(AccountMapper.convertToAccountDTO(accountDO), HttpStatus.CREATED);
    }


}
