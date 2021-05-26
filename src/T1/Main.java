package T1;

public class Main {
    public  static void main(String[] args){
        People people=new People();
        ChinaPeople chinaPeople=new ChinaPeople();
        AmericalPeople americalPeople=new AmericalPeople();
        BeiJingPeople beiJingPeople=new BeiJingPeople();

        people.speakHello();
        americalPeople.speakHello();
        chinaPeople.speakHello();
        chinaPeople.averageHeight();
        americalPeople.averageHeight();
        beiJingPeople.averageHeight();
        chinaPeople.averageWeight();
        americalPeople.averageWeight();
        beiJingPeople.averageWeight();
        beiJingPeople.BeiJingOpera();
    }

}
