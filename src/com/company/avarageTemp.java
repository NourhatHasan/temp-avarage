package com.company;

import java.util.Scanner;

public class avarageTemp {

    public void avarage(){
        System.out.println("how many days?");
        Scanner sc= new Scanner(System.in);

        int numDays= sc.nextInt();
        if(numDays>1) {
            int sum=0;
            int[] temps= new int[numDays];
            int aboveAvarage=0;


            for(int x = 1;x<=numDays;x++) {
                System.out.println("Day "+ x+" high temp");
                int i = sc.nextInt();
                sum = (sum + i);
                temps[x-1]=i;
            }
            double avarage=sum/numDays;


            for(int i=0;i<temps.length;i++){
                if(temps[i]>avarage){
                    aboveAvarage++;
                }
            }

            System.out.println("avarage "+ avarage);


            System.out.println(aboveAvarage+" day(s) above avarage");


        }
        else{
            System.out.println("need at least 2 days");
        }
    }

}