package exp4;

import java.util.Scanner;

public class TextQueue {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Queue q=new Queue();
        System.out.print("请输入数据的个数:");
        int n=input.nextInt();
        for (int i=1;i<=n;i++) q.enqueue(i);
        while (!q.empty()){
            q.dequeue();
            q.showSize();
        }
    }

}
