package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.ResponseObjects.GetAccountResponse;
import com.codeline.sampleProject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {


    @Autowired
    AccountService accountService;

    @RequestMapping("Account/create")
    public void saveAccount()
    {
        createAccount();
    }

    @RequestMapping("account/get")
    public List<Account> getAccount ()
    {
        return accountService.getAccount();
    }

    @RequestMapping("account/get/{accountId}")
    public GetAccountResponse createAccount (@PathVariable Long accountId)
    {
        return accountService.getAccountById(accountId);
    }


    public void createAccount(){
        Account account = new Account();
        account.setAccountType("Save");
        account.setAccountNumber(548485);
        account.setBankName("Sohar");
        account.setBankBranch("Rustaq");
        account.setBranchCode(398);
        account.setSwiftCode("656757");
        account.setCreatedDate(new Date());
        account.setAccountHolderName("sami");
        account.setIsActive(true);
        accountService.saveAccount(account);



    }
    @RequestMapping("account/getByAccountNumber")
    public Account getAccountByAccountNumber(@RequestParam String accountNumber){
        return accountService.getAccountByAccountNumber(accountNumber);
    }
}
