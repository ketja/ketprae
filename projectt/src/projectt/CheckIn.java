package projectt;
import java.util.Scanner;

class CheckIn extends Hotel {
    daily d =new daily();
    monthly m =new monthly ();
    
    public void print(){
    System.out.println("*************Check In*************");
     int b ;
        
        do{
        System.out.println("Press 1 : daily");
        System.out.println("Press 2 : Monthly");
        Scanner a=new Scanner(System.in);
        System.out.print("Choose >>>");
        b=a.nextInt();
        if(b==1){
              d.print();
          }else if(b==2){
              m.print();
        }
         }while(b!=1 && b!=2);
    }
   
   
    public void checkday(){ 
        System.out.println("1 : Single bad      650  Bath ");
        System.out.println("2 : Double bad    1,000  Bath ");
        System.out.println("3 : Recognizance    500  Bath");
        System.out.println(">>> Free wifi");
        d.print();
    }
    public void checkmonth(){
        System.out.println("1 : Single bad   12,000    Bath ");
        System.out.println("2 : Double bad   16,000    Bath ");
        System.out.println("3 : Recognizance  1,000    Bath ");
        System.out.println("4 : Wifi            199    Bath ");
        m.print();
    }
   
}
