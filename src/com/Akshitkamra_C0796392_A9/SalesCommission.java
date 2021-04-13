package com.Akshitkamra_C0796392_A9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesCommission {
    static double[] sale;
    static double[] advance;
    static double[] totalPayment;
    static double payment=0;
    public static void main(String args[]){
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total number of Salesperson’s ");
        int num = sc.nextInt();
        sale = new double[num];
        advance = new double[num];
        totalPayment = new double[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter "+(i+1)+ " salesperson’s monthly sale");
            sale[i]=sc.nextDouble();
            System.out.println("Enter total amount of advance pay");
            advance[i]=sc.nextDouble();
            payment=0;
            if(sale[i] < 10000)
                payment=sale[i]*0.5;
            else if(sale[i]>=10000 && sale[i]<15000)
                payment=sale[i]*0.10;
            else if(sale[i]>=15000 && sale[i]<18000)
                payment=sale[i]*0.12;
            else if(sale[i]>=18000 && sale[i]<22000)
                payment=sale[i]*0.15;
            else if(sale[i] >=22000)
                payment = sale[i]*0.16;
            totalPayment[i]=payment-advance[i];
        }
        for(int j=0;j<num;j++){
            System.out.println("Total commission for "+(j+1)+" salesperson's : " + df.format(totalPayment[j]));
        }
    }
}
