package Exp2;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Scanner;

public class Major {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two characters:");
        String major=input.nextLine();
         //映射思想，将字母映射到学科和年级，可以直接输出
        HashMap<Character,String> map=new HashMap<Character, String>();
        map.put('M',"数学");
        map.put('C',"计算机科学");
        map.put('I',"信息技术");
        map.put('1',"大一");
        map.put('2',"大二");
        map.put('3',"大三");
        map.put('4',"大四");
        if ((major.charAt(0)!='M'&&major.charAt(0)!='C'&&major.charAt(0)!='I')||
                (major.charAt(1)!='1'&&major.charAt(1)!='2'&&major.charAt(1)!='3'&&major.charAt(1)!='4')){
            System.out.println("Invalid input");
        }else {
            System.out.println(map.get(major.charAt(0))+"    "+map.get(major.charAt(1)));
        }
    }
}
