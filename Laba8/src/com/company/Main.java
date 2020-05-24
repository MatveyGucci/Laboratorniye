package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<5000; i++)
        {
            Thread2 Thread = new Thread2();
            Thread.start();
            try {Thread.join();}
            catch (Exception lol){
                System.out.println("error");
            }
        }
        Thread2.bank.generalammount();
    }
}
class Bank{
    ArrayList<Account> bd = new ArrayList<Account>();
    public Bank (){
        randombankaccount();
        generalammount();
    }
    public void Randomtrasfer(){
        int a = (int)(Math.random()*1000);
        int b = (int)(Math.random()*1000);
        int c = (int)(Math.random()*10000);
        transfer(bd.get(a), bd.get(b),c);
    }
    public void randombankaccount()
    {
        int a = 1;
        for (int i =0; i <1000; i++)
        {
            int l;
            l = (int)(Math.random()*30000);
            Account pacan = new Account(a,l,false);
            bd.add(pacan);
            a++;
        }
    }
    public void transfer (Account vidkogo, Account kuda, int howmuch)
    {
        int s=0;
        int d=0;
        for (int i =0;i < bd.size(); i++)
        {
            if (bd.get(i).isblocked == false) {
                if (bd.get(i) == vidkogo) {
                    bd.get(i).isblocked = true;
                    s = i;
                }
                if (bd.get(i) == kuda) {
                    bd.get(i).isblocked = true;
                    d = i;
                }
            }
            else{
                //System.out.println("Account is blocked");
            }
        }
        if (bd.get(s).balance<0)
        {
            //System.out.println("An error occurred when completing the transaction");
        }
        else
        {
            bd.get(s).balance -= howmuch;
            bd.get(d).balance += howmuch;
        }
    }
    public void generalammount()
    {
        int summ = 0;
        for (int i = 0;i < bd.size(); i++)
        {
            summ += bd.get(i).balance;
        }
        System.out.println(summ);
    }
}
class Account{
    int ID;
    int balance;
    boolean isblocked;
    public Account(int ID, int balance, boolean isblocked){
        this.ID = ID;
        this.balance = balance;
        this.isblocked = isblocked;
    }
}
class Thread2 extends Thread{
    static Bank bank = new Bank();
    public void run (){
        bank.Randomtrasfer();
    }
}
