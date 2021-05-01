package exp4;

import java.util.Scanner;
class complexCalc{
    private double real;
    private double virtual;

    public complexCalc(){real=0;virtual=0;};
    public complexCalc(double real,double virtual){
        this.real=real;
        this.virtual=virtual;
    }

    public void addComplex(complexCalc obj){
        real+=obj.real;
        virtual+=obj.virtual;
    }

    public void subComplex(complexCalc obj){
        real-=obj.real;
        virtual-=obj.virtual;
    }

    public void showResult(){
        if (virtual>0) System.out.print(real+"+"+virtual+"j");
        else if (virtual<0) System.out.print(real+""+virtual+"i");
        else System.out.print(real);
    }

}


public class Complex {
    static Scanner input=new Scanner(System.in);
    private static double real1,real2,vir1,vir2;
    public static void inputComplex(){
        System.out.println("请输入第一个复数的实部与虚部:");
        real1=input.nextDouble(); vir1=input.nextDouble();
        System.out.println("请输入第二个复数的实部与虚部:");
        real2=input.nextDouble(); vir2=input.nextDouble();
    }
    public static void main(String[] args){
        inputComplex();
        complexCalc c1=new complexCalc(real1,vir1);
        complexCalc c2=new complexCalc(real2,vir2);
        System.out.print("请输入如你要进行的操作(1为减法，2为加法)");
        int choice=input.nextInt();
        c1.showResult();
        if (choice==1) {
            System.out.print(" - ");
            c1.subComplex(c2);
        }else{
            System.out.print(" + ");
            c1.addComplex(c2);
        }
        c2.showResult();
        System.out.print(" = ");
        c1.showResult();
    }
}
