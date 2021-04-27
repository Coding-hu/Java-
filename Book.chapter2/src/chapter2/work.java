package chapter2;

import java.util.Scanner;

public class work {
    public  static  void main(String[] args){
        final double p=3.14159;
        Scanner input=new Scanner(System.in);
        {//第2.2题
            double radius, lenght;
            System.out.print("Enter the radius and lenght of a cylinder:");
            radius = input.nextDouble();
            lenght = input.nextDouble();
            System.out.println("The area is:"+radius*radius*p);
            System.out.println("The volume is:"+radius*radius*p*lenght);
        }
        {  //第2.6题
            int num;
            int ans=0;
            System.out.print("Enter the number between 0 and 1000:");
            num=input.nextInt();
            while (num!=0){
                ans+=num%10;
                num/=10;
            }
            System.out.println("The sum of the digits is:"+ans);
        }
        {//2.15题
            double x1,y1,x2,y2;
            System.out.print("Enter x1 and y1:");
            x1=input.nextDouble();
            y1=input.nextDouble();
            System.out.print("Enter x2 and y2:");
            x2=input.nextDouble();
            y2=input.nextDouble();
            double distance;
            distance=Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
            System.out.println("The distance between the two point is:"+distance);
        }

        {//2.21
            double investment, annualInterestRate,monthlyInterestRate,years,accumulateValue;
            System.out.print("Enter investment amount:");
            investment=input.nextDouble();
            System.out.print("Enter annual interest rate in percentage:");
            annualInterestRate=input.nextDouble();
            monthlyInterestRate=annualInterestRate/1200;
            System.out.print("Enter number of years:");
            years=input.nextDouble();
            accumulateValue=investment*Math.pow(1+monthlyInterestRate,years*12);
            System.out.printf("Accumulated value is : & %.2f",accumulateValue);
        }
    }
}




