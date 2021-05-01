package exp4;

import java.util.Random;

public class Zues {
    private  int Energy;
    private int exp=0; //初始经验值,规定每次交手产生伤害的10%为经验值，向下取整
    private int life=3; //初始生命值，当能量减为0时耗费一条生命，当经验值达到1000时，增加一条生命
    private int fightCount=0; //交手次数

    public Zues(){Energy=1000;}
    public Zues(int e){Energy=e;}

    public void beAttacked(int attack){Energy-=attack;}
    public int getEnergy(){return Energy;}
    public void setEnergy(int m){Energy=m;}
    public int getLife(){return life;}
    public void lifeDec(){life--;}
    public int getFightCount(){return fightCount;}

    public void fight(Titan t){
        Random rand=new Random();  //随机产生攻击力
        int f=rand.nextInt(70);
        exp+=f/10;
        if (exp>=200) {
            exp-=200;
            life++;
            System.out.println("Zues等级提升，生命增加一条");
        }
        fightCount++;
        t.beAttacked(f);   //对手掉血
        if (t.getLife()>0&&t.getEnergy()<=0) {
            t.lifeDec();
            t.setEnergy(1000);
        }
        System.out.println("Zues攻击了Titan,产生了"+f+"点伤害"
                +" Titan当前的血量为"+t.getEnergy()+" Titan还剩下"+t.getLife()+"条命");
    }


}
