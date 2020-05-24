package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[]f =new int[1];
        f[0]=1;
        System.out.println("Введите кол-во слов");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        String a2="";
        String a1;
        String a0;
        int tre = 0;
        System.out.println("Впишите слова");
        for (int i = 0; i < b; i++) {
            a1=a.next();
            a0 = sort(a1);
            a2+=a0;
        }
        for (String rtv : a2.split(" ")) {
            System.out.println(rtv);
        }
    }

    public static String[] Program(String[] g){
        String a2="";
        String a1;
        String a0;
        for (int i = 0; i < g.length; i++) {
            a1 = g[i];
            a0 = sort(a1);
            a2+=a0;
        }
        java.lang.String[] abc = a2.split(" ");
        return abc;
    }
    public static String sort(String slovo) {
        slovo.toLowerCase();
        char[] po = slovo.toCharArray();
        for (int j = 0; j < po.length; j++)
        {
            for (int g = j + 1; g < po.length - 1; g++)
            {
                if (po[j] == po[g + 1])
                {
                    return "";
                }

            }
        }
        return slovo;
    }

}
