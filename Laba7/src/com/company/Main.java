package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double summ;
        double summa = 0;
        int ammount = 8;
        for (int i = 0; i < ammount; i++)
        {
            scndThread Thread = new scndThread();
            Thread.start();
            try {
                Thread.join();
            }
            catch (Exception error)
            {
                System.out.println("Помилка");
            }

            summ = Thread.summ;
            summa+= summ;
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Pi is " + (summa/=8));
        System.out.println("THREADS "+ ammount);
        System.out.println("ITERATIONS 1000000*8");
        System.out.println("TIME "+ timeSpent + "ms");
    }
}
    class scndThread extends Thread
    {
        double summ = 0;
        public void run()
        {
            double x, y;
            summ = 0;
            double a = 0;
            for(long i = 0; i < 10000000; i++)
            {
                x = Math.random()*1.000000000000001;
                y = Math.random()*1.000000000000001;
                double o = x*x + y*y;
                if (o <= 1)
                {
                    a+=1;
                }
            }
            summ = (a/10000000)*4;
            //System.out.println("Pi is "+(summ));
        }
    }
