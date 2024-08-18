public class Bus{
    private int Busno;
    private int capacity;
    private boolean Ac;

     public Bus(int x,boolean y,int z){
        this.Busno=x;
        this.Ac=y;
        this.capacity=z;
     }
     public int getcapacity(){
        return capacity;
     }
     public void setcapacity(int cap){
        capacity=cap;
     }
     public boolean getAc(){
        return Ac;
     }
     public void setAc(boolean ac){
        Ac=ac;
     }
     public int getbusno(){
        return Busno;
     }
     public void display(){
        System.out.println("Bus No :"+Busno+" Ac : "+Ac+" capacity : "+capacity);
     }
}