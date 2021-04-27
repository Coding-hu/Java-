package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	// write your code here
//        { //使用循环语句计算8+88+888+...前10项之和
//            long  sum=0;          //求和
//            long  base=8;         //基数，也是第一个数吧
//            for (int i=1;i<=10;i++){     //前十项，也就是十次循环
//                sum+=base;
//                base=base*10+8;          //base转为下一项
//            }
//            System.out.println(sum);
//        }
//        {  //编写程序，输出满足1+2+3+....+n < 8888的最大正整数n。
//             int n=0;
//             int sum=0;
//             while (sum<8888){
//                 n++;
//                 sum+=n;
//             }
//             System.out.println("n的最大值为"+(n-1));  //加上最后一个n后不满足条件，所以n的最大值要减一
//        }
//        {//5.1
//            int sumOfPositives=0;
//            int sumOfNegatives=0;
//            int n;
//            int count=0; //计数器
//            int sum=0;
//            System.out.print("Enter an integer ,the input ends if it is 0 : ");
//            n=input.nextInt();
//            while (n!=0){
//                if (n<0) sumOfNegatives++;
//                else sumOfPositives++;
//                sum+=n;
//                count++;
//                n=input.nextInt();
//            }
//            System.out.println("The number of positives is "+sumOfPositives);
//            System.out.println("The number of negatives is "+sumOfNegatives);
//            System.out.println("The total  is "+sum);
//            System.out.printf("The average is %.2f  ",(double)sum/count);
//        }
//        { //5.2
//              final int NUMBER_OF_QUESTION=10;
//              int correctCount=0;
//              int count=0;
//              long startTime=System.currentTimeMillis();
//              String output="";
//              while (count<NUMBER_OF_QUESTION){
//                  int number1=(int)(Math.random()*15+1);
//                  int number2=(int)(Math.random()*15+1);
//                  System.out.print("What is "+number1+" + "+number2+" ?");
//                  int answer=input.nextInt();
//                  if(answer==number1+number2){
//                      System.out.println("You are right!");
//                      correctCount++;
//                  }else {
//                      System.out.println("You answer is wrong!\n"+number1+" + "+number2+
//                              "should be "+(number1+number2));
//                  }
//                  count++;
//                  output+="\n"+number1+"+"+number2+"="+answer+" is " +(((number1+number2)==answer)?"correct":"wrong");
//
//              }
//              long endTime=System.currentTimeMillis();
//              long testTime=endTime-startTime;
//              System.out.println("Correct count is"+correctCount+"\nTest time is "+testTime/1000+
//                            " seconds\n"+output);
//        }
//        {//5.7
//            double fee=10000.0;
//            double sumOfFee=0.0;
//            for (int i=0;i<=10;i++){
//                fee*=1.05;
//            }
//            System.out.printf("Ten years later,the fee is %.2f\n",fee);
//            for (int i=1;i<=4;i++){
//                sumOfFee+=fee;
//                fee*=1.05;
//            }
//            System.out.printf("The total fee is %.2f\n",sumOfFee);
//        }
//        {//5.14
//            int num1,num2;
//            System.out.print("Enter two integers:");
//            num1=input.nextInt();
//            num2=input.nextInt();
//            int d=Math.min(num1,num2);
//            while (d>0){
//                if(num1%d==0&&num2%d==0) {
//                    System.out.println("The biggest common divisor is "+d);
//                    break;
//                }
//                else d--;
//            }
 //       }
//        { //5.17
//            int n;
//            System.out.print("Enter an integer (1-15):");
//            n=input.nextInt();
//            for (int i=1;i<=n;i++){
//                for (int j=1;j<=n-i;j++){
//                    System.out.print("  ");
//                }
//                for (int k=i;k>=1;k--) System.out.print(k+" ");
//                for (int k=2;k<=i;k++) System.out.print(k+" ");
//                System.out.println("\n");
//            }
//
//        }
//        {//5.20
//            final  int NUMBER_OF_PRIME_OF_LINE=8;
//            int count=0;
//            for (int num=1;num<=1000;num++){
//                boolean isPrime=true;
//                for (int i=2;i<=Math.sqrt(num);i++){
//                    if(num%i==0) {
//                        isPrime=false;
//                        break;
//                    }
//                }
//                if(isPrime){
//                    System.out.print(num+" ");
//                    count++;
//                    if(count%NUMBER_OF_PRIME_OF_LINE==0) System.out.println();
//                }
//            }
     //   }
    }
}
