package com.SBIExample.project.Services;

import com.SBIExample.project.DTO.SBIDTO;
import com.SBIExample.project.Entity.SBIEntity;
import com.SBIExample.project.Repositories.SBIRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class SBIServices {

    Random random = new Random();
    private final ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private SBIRepo sbiRepo;

    public String createAccount(SBIDTO sbidto) {
        if (sbidto.getBalance() < 1000) {
            return "Initial deposit must be at least ₹1000.";
        }
        SBIEntity sbiEntity = new SBIEntity();
        sbiEntity.setName(sbidto.getName());
        sbiEntity.setEmail(sbidto.getEmail());
        sbiEntity.setBalance(sbidto.getBalance());
        sbiEntity.setMobile_NO(sbidto.getMobile_NO());
        sbiEntity.setPassword(sbidto.getPassword());


        long d = random.nextLong(9999, 9999999);
        sbiEntity.setAccount(d);
        sbiRepo.save(sbiEntity);

        return "Your account has been created successfully , your account number is " + d;

    }


    public synchronized String transfer(long debitAccount, long creditAccount, Double amount) {
        if (debitAccount == creditAccount) {
            return "Cannot transfer to same ACCOUNT";
        }
        Optional<SBIEntity> ODebitEntity = sbiRepo.findById(debitAccount);
        Optional<SBIEntity> OCreditEntity = sbiRepo.findById(creditAccount);
        if (OCreditEntity.isEmpty() || ODebitEntity.isEmpty()) {
            return "Account not found";
        }
        SBIEntity DebitEntity = ODebitEntity.get();
        SBIEntity CreditEntity = OCreditEntity.get();
        if (DebitEntity.getBalance() < amount) {
            return "insufficient balance";
        } else {
            DebitEntity.setBalance(DebitEntity.getBalance() - amount);
            CreditEntity.setBalance(CreditEntity.getBalance() + amount);
            sbiRepo.save(DebitEntity);
            sbiRepo.save(CreditEntity);
            return "Transfer Successful";
        }

    }

    public String IssueDebit_card(long account) {
        Optional<SBIEntity> optional =sbiRepo.findById(account);
        if(optional.isEmpty())
            return "Account not found";
        SBIEntity sbiEntity =  optional.get();
        if(!sbiEntity.isDebitCard()){
            sbiEntity.setDebitCard(true);
            sbiRepo.save(sbiEntity);
            return "Debit card Issued";
        }
        else{
            return "Debit card is already Issued";
        }
    }
    public String IssueCheckBook(long account) {
        Optional<SBIEntity> optional =sbiRepo.findById(account);
        if(optional.isEmpty())
            return "Account not found";
        SBIEntity sbiEntity =  optional.get();
        if(!sbiEntity.isCheckBook()){
            sbiEntity.setCheckBook(true);
            sbiRepo.save(sbiEntity);
            return "CheckBook  Issued";
        }
        else{
            return "CheckBook is already Issued";
        }
    }
    public String IssuePassBook(long account) {
        Optional<SBIEntity> optional =sbiRepo.findById(account);
        if(optional.isEmpty())
            return "Account not found";
        SBIEntity sbiEntity =  optional.get();
        if(!sbiEntity.isPassBook()){
            sbiEntity.setPassBook(true);
            sbiRepo.save(sbiEntity);
            return "Passbook  Issued";
        }
        else{
            return "Passbook is already Issued";
        }
    }

    public String credit(long account, Double amount) {
        Optional<SBIEntity> optional = sbiRepo.findById(account);
        if(optional.isEmpty()){
            return "Account not found";
        }
        SBIEntity sbiEntity = optional.get();
        sbiEntity.setBalance(sbiEntity.getBalance()+amount);
        sbiRepo.save(sbiEntity);
        return "Credited Successfully... your balance is"+sbiEntity.getBalance();
    }

    public String withdraw(long account, Double amount) {
        Optional<SBIEntity> optional = sbiRepo.findById(account);
        if(optional.isEmpty()){
            return "Account not found";
        }
        SBIEntity sbiEntity = optional.get();
        sbiEntity.setBalance(sbiEntity.getBalance()-amount);
        sbiRepo.save(sbiEntity);
        return "Debited Successfully... your balance is"+sbiEntity.getBalance();
    }

    public String deleteAccount(long account) {
        Optional<SBIEntity> optional = sbiRepo.findById(account);
        if(optional.isEmpty()){
            return "Account not found";
        }
        SBIEntity sbiEntity = optional.get();
        sbiRepo.delete(sbiEntity);
        return "Account no."+account+ "deleted Successfully";
    }

    public String updateEmail(long account, String email) {
        Optional<SBIEntity> optional = sbiRepo.findById(account);
        if(optional.isEmpty()){
            return "Account not found";
        }
        SBIEntity sbiEntity = optional.get();
        sbiEntity.setEmail(email);
        sbiRepo.save(sbiEntity);
        return "Updated successfully";
    }

    public String updateMobile(long account, long mobileNo) {
        Optional<SBIEntity> optional = sbiRepo.findById(account);
        if(optional.isEmpty()){
            return "Account not found";
        }
        SBIEntity sbiEntity = optional.get();
        sbiEntity.setMobile_NO(mobileNo);
        sbiRepo.save(sbiEntity);
        return "Updated successfully";
    }

    public String checkbalance(long account) {
        Optional<SBIEntity> optional = sbiRepo.findById(account);
        if(optional.isEmpty()){
            return "Account not found";
        }
        SBIEntity sbiEntity = optional.get();

        return "Your Balance is :"+sbiEntity.getBalance();
    }
}

