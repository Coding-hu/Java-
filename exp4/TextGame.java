package exp4;

public class TextGame {
    public static void main(String [] args){
        Titan t=new Titan();
        Zues z=new Zues();
        t.setEnergy(1000);
        z.setEnergy(1500);
        while (!(t.getEnergy()<=0||z.getEnergy()<=0)){
           if (t.getEnergy()>0) t.fight(z);
            if (z.getEnergy()>0) z.fight(t);
        }
        if (t.getEnergy()<=0)System.out.println("Titan的Energy值为"+t.getEnergy()+"，已经失败，获胜者是Zues！");
        else System.out.println("Zues的Energy值为"+z.getEnergy()+"，已经失败，获胜者是Titan！");
        System.out.println("两人的交手次数为"+Math.min(t.getFightCount(),z.getFightCount()));
    }
}
