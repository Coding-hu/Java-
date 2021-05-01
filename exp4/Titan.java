package exp4;

import java.util.Random;

public class Titan {
    private  int Energy;
    private int exp=0; //初始经验值,规定每次交手产生伤害的10%为经验值，向下取整
    private int life=3; //初始生命值，当能量减为0时耗费一条生命，当经验值达到1000时，增加一条生命
    private int fightCount=0; //交手次数

    public Titan(){Energy=80;}
    public Titan(int En){Energy=En;}

    public void setEnergy(int m){Energy=m;}
    public int getEnergy() {return Energy;}
    public void beAttacked(int m){Energy-=m;}
    public int getLife(){return life;}
    public void lifeDec(){life--;}
    public int getFightCount(){return fightCount;}

    public void fight(Zues z){
        Random rand=new Random();  //随机产生攻击力
        int f=rand.nextInt(90)+10;
        exp+=f/10; //经验增加
        if(exp>=200) {
            life++; //生命增加
            System.out.println("Titan等级提升，生命增加一条");
            exp-=200;
        }
        fightCount++;//交手次数增加
        z.beAttacked(f);   //对手掉血
        if (z.getLife()>0 &&z.getEnergy()<=0) {
            z.lifeDec(); //生命减一
            z.setEnergy(1500);
        }
        System.out.println("Titan攻击了Zues,产生了"+f+"点伤害"
                +" Zues当前的血量为"+z.getEnergy()+" Zues还剩下"+z.getLife()+"条命");
    }

}
