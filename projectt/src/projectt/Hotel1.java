package projectt;
import java.util.Scanner;

abstract class Hotel1 {
    int a ;
    CheckIn c = new CheckIn();
    CheckOut e = new CheckOut();
public void choose(){  
do{
        System.out.println("Press 1 : CheckIn");
        System.out.println("Press 2 : CheckOut");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Choose>>>>");
        a = sc1.nextInt();
        if(a==1){
              c.print();
          }else if(a==2){
           e.print();
        }
        }while(a!=1 && a!=2); 
}}
