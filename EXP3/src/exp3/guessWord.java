package exp3;

import java.util.Scanner;

class  solve{  //解决问题
    private String[] words={"words","java","program","school","doctor","girlfriend","lbwnb"};
    private int countOfWrong=0;  //错误的次数
    private int rand;     //参生的随机数
    private int lengthOfWord=0;   //字符串长度
    private boolean flag=true;  //是否猜完全正确的标志

    solve(int rand){this.rand=rand;}; //构造函数

    public void solvePromble(){
        Scanner input=new Scanner(System.in);
        String word=words[rand];  //随机参生的单词
        lengthOfWord=word.length();  //单词长度
        char[] str=word.toCharArray();  //将字符串转为数组
        char[] ch=new char[lengthOfWord];
        for (int i=0;i<lengthOfWord;i++) ch[i]='*';  //初始化数组

        while (flag){
            String ch1;
            System.out.print("(Guess) Enter a letter in word ");
            for (int i=0;i<lengthOfWord;i++) System.out.print(ch[i]+" ");
            System.out.print(">");
            ch1=input.nextLine();
            char c=ch1.charAt(0); //将字符串转为字母
            boolean q=false;
            for (int i=0;i<lengthOfWord;i++)
                if (str[i]==c&&ch[i]=='*'){
                    q=true;
                    ch[i]=c;
                    break;
                }

            if (!q) {
                System.out.println(c+" is not in the word");
                countOfWrong++; //猜错的次数加一
            }
            boolean f=true;
            for (int i=0;i<lengthOfWord;i++)  {  //查看是否还有没有猜的单词
                if (ch[i]=='*') f=false;
            }
            if (f) flag=false;   //如果都猜过了
        }
        System.out.println("The word is "+words[rand]+","+"you missed "+countOfWrong+" time");
    }

}

public class guessWord {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String ch;
        do{
            int rand=(int)(Math.random()*8);
            solve op=new solve(rand);
            op.solvePromble();
            System.out.print("Do you want to guess other word? (Y/N):");
            ch=in.nextLine();
        }while (ch.charAt(0)=='Y'||ch.charAt(0)=='y');

    }
}
