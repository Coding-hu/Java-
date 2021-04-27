package Exp2;

import java.util.Scanner;

public class Triange {
    public static void main(String[] args) {
        int n;    //三角形层数
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer (1-15):");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {  //层数循环
            for (int j = 1; j <= n - i; j++) {  //每层前面补空格
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k+" ");//左边数字从大到小输出
                if (k<10) System.out.print(" "); //多输出一个空格，控制输出图形
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k+" ");//右边数字从小打到输出
                if (k<10) System.out.print(" ");  //多输出一个空格，控制输出图形
            }
            System.out.println("\n"); //换行，下一层准备输出
        }
    }

}
