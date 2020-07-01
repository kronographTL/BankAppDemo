package com.demo.bankapp.service.bankaccount;

import com.demo.bankapp.domainobject.AccountDO;
import com.demo.bankapp.model.CreateAccountRequest;

public interface BankAccountService {

    AccountDO createAccount(CreateAccountRequest accountRequest);


}
