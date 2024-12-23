package com.SBIExample.project.Controller;

import com.SBIExample.project.DTO.SBIDTO;
import com.SBIExample.project.Services.SBIServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yono")
public class SBIController {
  private final SBIServices sbiServices;

    public SBIController(SBIServices sbiServices) {
        this.sbiServices = sbiServices;
    }

    @PostMapping
    public String  createAccount(@RequestBody SBIDTO sbidto){
        return sbiServices.createAccount(sbidto);
    }
    @PostMapping(path = "/transfer")
    public String transfer(@RequestParam long debitAccount, @RequestParam long creditAccount, @RequestParam Double amount) {
        return sbiServices.transfer(debitAccount, creditAccount, amount);
    }
    @PostMapping("/dcard")
     public String IssueDCard(@RequestParam(name = "acc") long Account){
        return  sbiServices.IssueDebit_card(Account);
    }
    @PostMapping("/CBook")
    public String IssueCBook(@RequestParam long Account){
        return sbiServices.IssueCheckBook(Account);
    }
    @PostMapping("/PBook")
    public String IssuePBook(@RequestParam long Account){
        return sbiServices.IssuePassBook(Account);
    }
    @PostMapping("/credit")
    public String creditAccount(@RequestParam long Account,@RequestParam Double Amount){
        return  sbiServices.credit(Account,Amount);
    }
    @PostMapping("/debit")
    public String debitAccount(@RequestParam long Account,@RequestParam Double Amount){
        return sbiServices.withdraw(Account,Amount);
    }
    @DeleteMapping("/delete")
    public String deleteAccount(@RequestParam long Account){
        return sbiServices.deleteAccount(Account);
    }
    @PutMapping("/email")
    public String updateEmail(@RequestParam long Account,@RequestParam String email){
        return sbiServices.updateEmail(Account,email);
    }
    @PutMapping("/mobile")
    public String updateEmail(@RequestParam long Account,@RequestParam long mobile_no){
        return sbiServices.updateMobile(Account,mobile_no);
    }
    @GetMapping("/balance")
    public String checkBalance(@RequestParam long Account){
        return sbiServices.checkbalance(Account);
    }

}

