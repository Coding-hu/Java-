package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        {  //3.2
//            int number1 = (int) (System.currentTimeMillis() % 10);
//            int number2 = (int) (System.currentTimeMillis() * 7 % 10);
//            int sum;
//            System.out.print("please input the sum of two numbers:");
//            sum = input.nextInt();
//            System.out.println("Your answer is " + (sum == number1 + number2));
//            if(!(sum == number1 + number2)) {
//                System.out.println("The right answer is "+(number1+number2));
//            }
 //       }
//        {
//            String [] monthly={"0","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept",
//                    "Oct","Nov","Dec"};
//            int month=(int) (Math.random()*12+1);
//            System.out.println("The month-number is:"+month);
//            System.out.println("monthly is："+monthly[month]);
//        }
//
//        {//3.12
//            System.out.print("Enter a tree-digit integer:");
//            int num=input.nextInt();
//            String str1=num+"";
//            StringBuilder str2=new StringBuilder(str1);
//            str2.reverse();
//            for (int i=0;i<str1.length();i++){
//                if (str1.charAt(i)!=str2.charAt(i)){ System.out.println(str1+"is not a palindrome");return ;}
//            }
//            System.out.println(str1+" is a palindrome");
//        }
//        {//3.17
//            String[] str={"rock","scissor","paper"};
//            int numOfComputer,numOfPeople;
//            numOfComputer=(int)(Math.random()*3);
//            System.out.print("scissor(0),rock(1),paper(2):"); numOfPeople=input.nextInt();
//            if (numOfComputer==numOfPeople)
//                System.out.println("The computer is "+str[numOfComputer]+". You are too. It is a draw");
//            else {
//                if ((numOfComputer+4)%3==numOfPeople)
//                    System.out.println("The computer is "+str[numOfComputer]+". You are the "+str[numOfPeople]
//                            +". You lost");
//                else
//                    System.out.println("The computer is "+str[numOfComputer]+". You are the "+str[numOfPeople]
//                            +".You win");
//            }
//        }
        {
            String days[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday",};
            int q,h,m,year;
            System.out.print("Enter year:"); year=input.nextInt();
            System.out.print("Enter month:"); m=input.nextInt();
            if (m==1 ||m==2) {
                m += 12;
                year -= 1;
            }
            System.out.print("Enter the day of the month:1-31 ");q=input.nextInt();
            h=(q+26*(m+1)/10 +year%100+year%100/4+year/100/4+year/100*5)%7;
            System.out.println("Day of the week is "+days[h]);
        }
    }
}
