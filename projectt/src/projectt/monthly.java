package projectt;
import java.util.Scanner;

 class monthly extends Hotel{
    
    public void print(){
        System.out.println("-------------Monthly--------------");
       
        int c=0 ,h,j,m ;
        CheckIn n =new CheckIn();
        
        while(c!=1 && c!=2 ){
        System.out.println("Press 1 : single bad");
        System.out.println("Press 2 : Double bad");
        System.out.println("Press 3 : Check");
        Scanner a=new Scanner(System.in);
        System.out.print("Choose >>>");
        c=a.nextInt();
        if(c==1){
            super.sum = super.sM+super.gM ;
            Scanner sc=new Scanner(System.in);
        System.out.print("How many rooms >>>");
        m=sc.nextInt();
        super.billMonthly(m);
        }else if(c==2){
            super.sum= super.dM+super.gM ;
            Scanner sc=new Scanner(System.in);
        System.out.print("How many rooms >>>");
        m=sc.nextInt();
        super.billMonthly(m);
           
        }else if (c==3){
            n.checkmonth();
        }
        }
        
    }
}

