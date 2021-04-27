package exp3;

public class number {
    public static long reserve(long num){  //将数倒置
        long ans=0;
        while (num!=0) {
            ans=ans*10+num%10;
            num/=10;
        }
        return ans;
    }
    public static boolean isPalindrome(long num){ //判断是否为回文数
        long ans=reserve(num);
        if (ans==num) return true;
        else return false;
    }
    public static void main(String[] args){
        System.out.println("满足的数有:");
        for (long i=1;i<=99999;i++){
            if (isPalindrome(i)&&isPalindrome(i*i)&&isPalindrome(i*i*i))
                System.out.print(i+" ");
        }
    }
}
