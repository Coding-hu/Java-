package T3;

public class Animal {
    private int id;
    protected String race;
    public Animal(){};
    public Animal(int id){
        this.id=id;
    }
    public void showMessage(){
        System.out.print("id="+id+" race="+race+" ");
    }

}

class birds extends Animal implements Talent{
    private String talent="fly";
    @Override
    public void showTalent() {
        System.out.println("talent="+talent);
    }
    public birds(){};
    public birds(int id){
        super(id);
        race="birds";
    }
}

class insect extends Animal implements Talent{
    private String talent="small";
    public void showTalent(){
        System.out.println("talent="+talent);
    }
    public insect(){};
    public insect(int id){
        super(id);
        race="insect";
    }
}
class fish extends Animal implements  Talent{
    private String talent="swim";
    public void showTalent(){
        System.out.println("talent="+talent);
    }
    public fish(){};
    public fish(int id){
        super(id);
        race="fish";
    }
}
