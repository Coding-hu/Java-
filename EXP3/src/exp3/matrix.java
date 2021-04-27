package exp3;

import java.util.Scanner;

public class matrix {
    private static int[][] matrix=new int[5][5]; //第三维记录最大子阵规模
    private static int[] num=new int[3];  //存放矩阵在各个位置上的子阵大小

    static void solve(int N){
        boolean t=true;
        int i=0,j=0,l;
        for (l=N;l>=1;l--){
            for (i=0;i<=N-l;i++){
                for (j=0;j<=N-l;j++){
                    t=true;
                    for (int x=i;x<i+l;x++){
                        for (int y=j;y<j+l;y++){
                            if (matrix[x][y]==0) {
                               t=false;
                               break;
                            }
                        }
                        if (t==false) break;
                    }
                    if (t==true) break;
                }
                if (t==true) break;
            }
            if (t==true) break;
        }
        num[0]=i;
        num[1]=j;
        num[2]=l;
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of rows in the square matrix:");
        int N=input.nextInt();

        for (int i=0;i<N;i++)   //将矩阵赋值
            for (int j=0;j<N;j++)
                matrix[i][j]=input.nextInt();

        solve(N);
        System.out.println("The maxmun square submatrix is at "+"("+num[0]+","+num[1]+")" +"with size "+num[2] );
    }
}
