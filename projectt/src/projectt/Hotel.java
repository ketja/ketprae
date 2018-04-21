package projectt;
import java.util.Scanner;

abstract class Hotel {
   
    public int sum = 0 ;
    public int total=0;
    private int m = 0;
    public int sD = 650;
    public int dD = 1000;
    public int gD = 500;
    public    int sM =12000 ;
    public    int dM =16000 ;
    public    int gM=1000 ;
    public int totalwater;
    private int water = 0;
    public int totalelectric;
    private int electric=0;
    public int turn=0;
    

    public abstract void print();
    

    
    public void billDaily(int m){
        this.m = m;
        this.total = this.m*this.sum;
        this.turn = this.m*this.gD;
        int j=0 ,h=0 ;
        System.out.println("***************Bill***************");
        System.out.println("Price :            " + this.total );
        Scanner a =new Scanner(System.in);
        System.out.print("Received :         ");
         h =a.nextInt();
         
        
         j=h-this.total ;
        System.out.println("Change :           " + (j+this.turn));
        System.out.println("Call : 061-2044434");
        System.out.println("Wifi : ketmaneenichakorn");
        want n =new want(){};
        n.print();
        
         
        
    }
    
    public void billMonthly(int m){
        this.m = m;
        this.total = this.m*this.sum;
        this.turn = this.m*this.gM;
        int j ,h ;
        System.out.println("***************Bill***************");
        System.out.println("Price :            " + this.total );
        Scanner a =new Scanner(System.in);
        System.out.print("Received :         ");
         h =a.nextInt();
         j=h-this.total ;
        System.out.println("Change :           " + (j+this.turn));
        System.out.println("Call : 061-2044434");
        System.out.println("Wifi : ketmaneenichakorn");
        want n =new want(){};
        n.print();
    }
    
    public int calwater(int water){
        this.totalwater=0;
        this.water = water;
        if(this.water <= 10){
            return this.totalwater;
        }else{
            
        for(int i=0;i<this.water;i++){
            this.totalwater += 12;
        }
        return totalwater;
        }
    }
    
    public int calelectric(int electric){
        this.totalelectric=0;
        this.electric = electric;
        for(int j =0;j<this.electric;j++){
            this.totalelectric += 7;
        }
        return totalelectric;
    }
}

    
