package exp3;

import java.util.Scanner;

public class checkPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个密码:");
        String str = input.nextLine();
        if (checkPassword(str)) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }
   static boolean checkPassword(String str){
        int countOfNumber=0; //累计数字的个数
        if (str.length()<8) return false; //长度小于8就不是合法密码
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))||Character.isLowerCase(str.charAt(i))||
                Character.isUpperCase(str.charAt(i))||str.charAt(i)=='_'){ //判断是否为数字，或者是字母，或者为下划线
                if (Character.isDigit(str.charAt(i))) countOfNumber++; //如果是数字的话，数字个数+1
            }else return false;  //只有有一个字符不满足就不是合法密码
        }
        if (countOfNumber<2) return false;
        return true;
    }
}
