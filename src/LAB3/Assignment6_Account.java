/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

class Account {

    String id;
    String name;
    int balance = 0;

    Account() {
    }

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int creditAmount(int amount) {
        if (amount <= balance) {
            balance = balance + amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int debitAmount(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int trasferTo(String anotherAccount, int amount){
        if(amount <= balance){
            balance = balance - amount;//balance deducted
            System.out.println("The amount is transfered");
        }
        else{
            System.out.println("Amount exceeded blance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

public class Assignment6_Account {

    public static void main(String args[]) {
        Account a = new Account("909DR","Dinesh Rana",10000);
        Account a1 = new Account("A2022","Bibek");
        //test getter method
        System.out.println("ID: "+a.getID());
        System.out.println("Name: "+a.getName());
        System.out.println("Balance: "+a.getBalance());
        System.out.println("Debit balance"+a.debitAmount(1000));
        System.out.println("credit balance"+a.creditAmount(1000));

        //test transfer
        a.trasferTo("a1",1000);
        System.out.println("Transferred to:"+a1);
        System.out.println(a);
    }
}
