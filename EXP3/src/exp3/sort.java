package exp3;

import java.util.Scanner;

public class sort {
     static boolean isSorted(int[] list){
         int m=list.length;
         for (int i=0;i<m-1;i++) if (list[i]>list[i+1]) return false;
         return true;
     }
    public static void main(String[] args){
        int N;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list:");
        N=input.nextInt();
        int[] list=new int[N];
        for (int i=0;i<N;i++) list[i]=input.nextInt();
        if (isSorted(list)) System.out.println("The list is already sorted");
        else System.out.println("The list is not sorted");

    }
}
