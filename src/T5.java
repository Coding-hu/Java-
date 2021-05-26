import java.util.Scanner;

public class T5 {
    private static int[] array=new int[10000];
    public static void whichi(int n){
        char[] chars=new char[1];
        int m=n;
        for (int i=2;i<Math.sqrt(m);i++){
            while (n%i==0){
                array[i]++;
                n/=i;
            }
        }
        int ans=1;
       for (int i=0;i<m;i++){
           if (array[i]%2==1) ans*=i;
       }
       System.out.println("最小的i值为:"+ans+" 最小的平方数为:"+ans*m);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int m=input.nextInt();
        whichi(m);
    }
}
