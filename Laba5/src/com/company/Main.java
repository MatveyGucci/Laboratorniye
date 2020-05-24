 package com.company;
 
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class Main {
 
     public static void main(String[] args) {
     }
 }
     class product{
         String name;
         int price;
         public product(String name, int price)
         {
             this.name = name;
             this.price = price;
         }
     }
     class cashregister {
         public ArrayList<String> scanproducts ( ArrayList<product> basket){
             ArrayList<String> cheque = new ArrayList<String>();
             ArrayList<product> reservbasket = new ArrayList<product>();
             reservbasket.addAll(basket);
 
             for (product ror : basket) {
                 int o =0;
                     while (reservbasket.contains(ror))
                     {
                         reservbasket.remove(ror);
                         o++;
                     }
                     if (o !=0)
                     cheque.add(ror.name + " " + o + " " + ror.price*o+"грн");
                 }
             Collections.sort(cheque);
             return cheque;
         }
     }
 
 
