package com.SBIExample.project.DTO;

import lombok.Data;

@Data

public class SBIDTO {
    String Name;
    String Password;
    String Email;
    Long Mobile_NO;
    double Balance;
    public SBIDTO(){}
    public SBIDTO(String name, String password, String email, double balance, Long mobile_NO) {
        Name = name;
        Password = password;
        Email = email;
        Balance = balance;
        Mobile_NO = mobile_NO;
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

}
