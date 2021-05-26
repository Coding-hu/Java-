package T3;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Animal[] animals=new Animal[100];
        for (int i=0;i<100;i++){
            Random random=new Random();
            int temp=random.nextInt(1000);
            if (temp%3==0) animals[i]=new birds(temp);
            else if(temp%3==1) animals[i]=new insect(temp);
            else animals[i]=new fish(temp);
        }
        for (int i=0;i<100;i++){
            animals[i].showMessage();
            if (animals[i].race.equals("birds")) new birds().showTalent();
            else if(animals[i].race.equals("insect")) new insect().showTalent();
            else new fish().showTalent();
        }
    }
}
