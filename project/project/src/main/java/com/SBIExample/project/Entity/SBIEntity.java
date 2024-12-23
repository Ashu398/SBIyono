package com.SBIExample.project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SBIEntity {
    @Id

    Long Account;
    String Name;
    String Password;
    String Email;
    Long Mobile_NO;
    double Balance;

    boolean debitCard ;
    boolean checkBook ;
    boolean passBook ;

    public Long getAccount() {
        return Account;
    }

    public void setAccount(Long account) {
        Account = account;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getMobile_NO() {
        return Mobile_NO;
    }

    public void setMobile_NO(Long mobile_NO) {
        Mobile_NO = mobile_NO;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public boolean isCheckBook() {
        return checkBook;
    }

    public void setCheckBook(boolean checkBook) {
        this.checkBook = checkBook;
    }

    public boolean isDebitCard() {
        return debitCard;
    }

    public void setDebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public boolean isPassBook() {
        return passBook;
    }

    public void setPassBook(boolean passBook) {
        this.passBook = passBook;
    }
}
