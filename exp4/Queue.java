package exp4;

public class Queue {
    private int[] element;
    private int maxLenght;
    private int size=0;

    public  Queue(){
        maxLenght=8;
        element=new int[maxLenght];
    }
    public void enqueue(int n){
       if (size>=maxLenght) {
           int[] newElement = new int[maxLenght * 2];
           System.arraycopy(element,0,newElement,0,element.length);
           element = newElement;
           maxLenght*=2;
       }
        element[size++]=n;
    }
    boolean empty(){
        if (size==0) return true;
        else return false;
    }
    public void dequeue(){
        if (empty()) {
            System.out.println("对列为空，没有数值");
        }else{
            int pop=element[0];
            for (int i=1;i<element.length;i++) element[i-1]=element[i];
            size--;
            System.out.println("弹出的值为:"+pop);
        }
    }
    public int getSize() {return size;}
    public void showSize(){
        if (size==0) System.out.println("队列中没有数");
        else {
            System.out.println("现在队列中的数依次为");
            for (int i=0;i<size;i++) System.out.print(element[i]+" ");
            System.out.println();
        }
    }
}
