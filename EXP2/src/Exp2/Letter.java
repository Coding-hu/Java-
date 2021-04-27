package Exp2;

import java.util.Scanner;

public class Letter {
    public static void main(String[]args){
        int lottery=(int)(Math.random()*1000);  //随机产生一个三位数
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits):");
        int guess=input.nextInt();
 //数组标记思想来判断彩票开奖数字与买彩票的数字是否存在相同的数字
        int lotteryDigit1=lottery%10;     //彩票数的个位
        int lotteryDigit2=lottery/10%10;  //十位
        int lotteryDigit3=lottery/100;    //百位
        int lot[] =new int[11];
        lot[lotteryDigit1]++;
        lot[lotteryDigit2]++;
        lot[lotteryDigit3]++;
        int guessDigit1=guess%10;     //猜数的个位
        int guessDigit2=guess/10%10;  //猜数的十位
        int guessDigit3=guess/100;   //猜数的百位
        int gue[] =new int[10];
        gue[guessDigit1]++;
        gue[guessDigit2]++;
        gue[guessDigit3]++;
        if (guess==lottery) System.out.println("Exact  math:you win $10000"); //完全猜中
        else if (lot[guessDigit1]!=0&&lot[guessDigit2]!=0&&lot[guessDigit3]!=0){
             System.out.println("Match all digits:you win #3000");
        }
        else if ((lot[guessDigit1]!=0 &&lot[guessDigit2]==0 &&lot[guessDigit3]==0)|| //数组标记法来判断
                 (lot[guessDigit2]!=0 &&lot[guessDigit1]==0 &&lot[guessDigit3]==0)|| //不等于零，说明存在该数字
                 (lot[guessDigit3]!=0 &&lot[guessDigit1]==0 &&lot[guessDigit2]==0))
             System.out.println("Match one digit:you win $1000");
        else System.out.println("Sorry,no match");
        System.out.println("The lottery number is:"+lottery);
    }
}
