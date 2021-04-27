package Exp2;

import java.util.Scanner;

public class Calender {      //判断是否为闰年
    static int isWhatYear(int year){
        if (year%400==0 ||(year%4==0 &&year%100!=0)) return 0;
        else return 1;
    }

    static  void showCalender(int day,int year){
        int days[][] =new int [][]{{0,31,29,31,30,31,30,31,31,30,31,30,31},  //润年
                {0,31,28,31,30,31,30,31,31,30,31,30,31}}; //平年
        int count=day;
        int month=1;
        while (month<=12){     //循环输出12个月的日历
            System.out.println("           "+year+"年"+month+"月"+"      ");
            System.out.println("------------------------------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
            for (int i=1;i<=count;i++) System.out.print("     "); //日历第一行前面补空格
            for (int i=1;i<=days[isWhatYear(year)][month];i++){   //该月的天数
                if (i<10) System.out.print(" ");                  //1-9补个空格，控制格式
                System.out.print(i+"   ");
                count++;
                if (count>=7) {            //满7换行
                    System.out.println();
                    count%=7;
                }
            }
            System.out.println();
            month++;                       //下一个月
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入年份和该年第一天是星期几的数字(星期天为数字0):");
        int year=input.nextInt();
        int day=input.nextInt();
        showCalender(day,year);
    }
}
