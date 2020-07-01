package com.demo.bankapp.dao;

import com.demo.bankapp.domainobject.AccountDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<AccountDO,String> {

}
