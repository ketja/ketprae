package projectt;
import java.util.Scanner;

class CheckOut extends Hotel  {
     private int water = 0 ;
     private int electric =0 ;
     private int discount ;
     CheckIn n =new CheckIn();
  
     public void print(){
        
        String u ="111";
        String p ="111";
        String iu,ip ;
        Scanner sc =new Scanner (System.in);
        System.out.print("Username :");
        iu=sc.nextLine();
        System.out.print("Password :");
        ip=sc.nextLine();
        while(!(iu.equals(u)&&(ip.equals(p)))){
            System.out.println("Invalid username or password");
          System.out.print("Username :");
          iu=sc.nextLine();
        System.out.print("Password :");
        ip=sc.nextLine();
      }  
        System.out.println("*********CheckOut***********");
         
        Scanner sc1 =new Scanner (System.in);
        System.out.print("Amount of water used >>> ");
        int w =sc1.nextInt();
        System.out.print("Amount of electric used >>> " );
        int e =sc1.nextInt();
        

        
        
        System.out.println("************Bill**************");
        System.out.println("Water price               " + super.calwater(w));
        System.out.println("electric price            " + super.calelectric(e)); 
        System.out.println("Total                     "+ (super.calwater(w)+super.calelectric(e)));
       
        
            
        }
    
    
}


