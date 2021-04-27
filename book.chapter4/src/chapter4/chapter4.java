package chapter4;

import java.util.Scanner;
public class chapter4 {
    public  static  void  main(String[] args){
        Scanner input=new Scanner(System.in);
//        { //4.5
//            int sides;double side,polygon;
//            System.out.print("Enter the number of sides:"); sides=input.nextInt();
//            System.out.print("Enter the side:");side=input.nextDouble();
//            int degree=(sides-2)*180/sides;
//            if (degree>=90) degree/=2;
//            double radians=Math.toRadians(90-degree);
//            polygon=side*sides/4/Math.tan(radians);
//            System.out.println("The area of the polygon is "+polygon);
//        }
//        {//4.15
//            String str;
//            char str2;
//            System.out.print("Enter a letter:"); str=input.nextLine();
//            str=str.toLowerCase();
//            str2=str.charAt(0);
//            int num=str2-'a'+1;
//            System.out.println("The corresponding number is "+(num/3+2));
//        }
        {//4.20
            System.out.print("请输入一个字符串：");String str=input.nextLine();
            System.out.println("字符串长度为:"+str.length());
            System.out.println("字符串第一个字符为:"+str.charAt(0));
        }
//        {
//            String str1,str2;
//            System.out.print("Enter string str1:");str1=input.nextLine();
//            System.out.print("Enter string str2:");str2=input.nextLine();
//            if (str1.indexOf(str2)!=-1) System.out.println(str2+" is a substring of "+str1);
//            else  System.out.println(str2+" is not a substring of "+str1);
//        }
    }
}
