package T1;

public class ChinaPeople extends People {
    public void ChinaGongFu(){;}
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        height=168.8;
        System.out.println("中国人的平均身高(cm):"+height);
    }
    public void averageWeight(){
        weight=65.0;
        System.out.println("中国人的平均体重(kg):"+weight);
    }
}
