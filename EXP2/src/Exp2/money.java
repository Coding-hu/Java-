package Exp2;

import java.util.Scanner;

public class money {
    public static void main(String[] args){
        String number1[]=new String[]{"零","元","拾","佰","仟"};
        String number3[]=new String[]{"0","分","角"};
        String number2[]=new String[]{"0","壹","贰","叁","肆","伍","陆","柒","捌","镹"};
        int arrayInt[]=new int[10];
        int arrayDou[]=new int[3];
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个数值:");
        String mon=input.nextLine();
        double money=Double.parseDouble(mon);    //将字符串转为double,并且去掉了字符串的前后缀0
        int partOfInt=(int)money;                //钱的整数部分
        double partOfDou=money-partOfInt;        //钱的小数部分
        int partOfDouToInt=(int)(partOfDou*100);   //将小数乘100转换为整数
        int count=1;  //整数位数
        while (partOfInt!=0){                   //将整数钱每位的数字提取
            arrayInt[count++]=partOfInt%10;
            partOfInt/=10;
        }
        int countDou=1; //小数位数
        while (partOfDouToInt!=0){           //将小数的钱每位数字提取
            arrayDou[countDou++]=partOfDouToInt%10;
            partOfDouToInt/=10;
        }
        //输出整数部分的钱
        int flag=1;  //判断是否连续的第一次出现的零
        for (int i=count-1;i>=1;i--){
            if(arrayInt[i]==0) {
                if (i!=1){
                    if (flag==1) {  //连续出现的第一个零,保证连续的零只输出一个‘零’
                        System.out.print("零");
                        flag=0;  //置假
                    }
                    i--;   //出现零就下一个数
                    if (flag==0) i--;   //如果该零是连续的零，就直接判断下一个数，其他的什么都不做
                }else {      //个位数为0
                        System.out.print(number1[1]);
                        flag=1;      //连续的零中断,再把标志置真，只有四位整数，其实用不到
                        break;
                }
            }
         else   System.out.print(number2[arrayInt[i]]+number1[i]);
        }
        if (partOfDou==0)   System.out.print('整');
        else {  //小数部分最多两位数
            if (arrayDou[2]==0) System.out.print("零");
            else System.out.print(number2[arrayDou[2]]+number3[2]);
            if (arrayDou[1]==0) ;
            else System.out.print(number2[arrayDou[1]]+number3[1]);
        }
    }
}
