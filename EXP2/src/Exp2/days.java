package Exp2;
import java.util.Scanner;

public class days {
    static int isWhatYear(int year){  //判断是否为闰年
        if (year%400==0 ||(year%4==0 &&year%100!=0)) return 0;
        else return 1;
    }
    static int whichMonth(String month){   //字符串转换为数字(月份转换)
        if (month.equals("Jan")) return 1;
        if (month.equals("Feb")) return 2;
        if (month.equals("Mar")) return 3;
        if (month.equals("Apr")) return 4;
        if (month.equals("May")) return 5;
        if (month.equals("Jun")) return 6;
        if (month.equals("July")) return 7;
        if (month.equals("Aug")) return 8;
        if (month.equals("Sep")) return 9;
        if (month.equals("Oct")) return 10;
        if (month.equals("Nov")) return 11;
        if (month.equals("Dec")) return 12;
        else return 0;
    }
    public  static void  main(String[]args){
        int day[][] =new int [][]{{0,31,29,31,30,31,30,31,31,30,31,30,31},  //润年
                                  {0,31,28,31,30,31,30,31,31,30,31,30,31}}; //平年
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=input.nextInt();
        System.out.print("Enter a month(Jan、Feb...):");
        String month=input.next();
        System.out.println(year+"年"+whichMonth(month)+"月"+" has "+day[isWhatYear(year)][whichMonth(month)]+" days");
    }
}
