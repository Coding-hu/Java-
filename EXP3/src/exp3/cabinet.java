package exp3;

public class cabinet {
    public static void main(String[] args){
        boolean []cab=new boolean[101]; //柜子关着为false，开着为true
        for (int i=1;i<=100;i++) {  //100个学生
            for (int j=i;j<=100;j+=i){  //改变柜子状态
                if (!cab[j]) cab[j]=true;
                else cab[j]=false;
            }
        }
        System.out.println("开着的柜子有:");
        for (int i=1;i<=100;i++) {
            if (cab[i]) System.out.print(i+" ");
        }
    }
}
