/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vyngo
 */
public class AccountDirectory {
   
    private ArrayList<Account> accounts;

    // Constructor initializing the ArrayList
    public AccountDirectory() {
        this.accounts = new ArrayList<>();
    }

    // Getter for accounts list
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // Setter for accounts list
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    // Method to add a new account to the directory
    public Account addAccount() {
        Account a = new Account();
        accounts.add(a);
        return a;
    }

    // Method to delete an account from the directory
    public void deleteAccount(Account account) {
        accounts.remove(account);
    }
}
    

