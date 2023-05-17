package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount(){
        createAccount();

    }
    public void createAccount(){
        Account account = new Account();
        account.setAccountType("Save");
        account.setAccountNumber("1234567890987");
        account.setBankName("Sohar");
        account.setBankBranch("Rustaq");
        account.setBranchCode(398);
        account.setSwiftCode("656757");
        account.setCreatedDate(new Date());
        account.setAccountHolderName("sami");
        account.setIsActive(true);
        accountService.saveAccount(account);



    }
}
