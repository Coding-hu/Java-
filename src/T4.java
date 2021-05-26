import java.util.ArrayList;
import java.util.Scanner;

public class T4 {
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i)==list.get(j)) {
                    list.remove(j);
                    j--; //删除后，arraylist里面得数会自动往前移一个位置，所以j不能动。
                }
            }
        }
        for (int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten integers：");
        for (int i=1;i<=10;i++) arrayList.add(input.nextInt());
        removeDuplicate(arrayList);
    }
}
