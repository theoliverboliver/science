import java.util.Random;
import java.util.Scanner;
public class kevin {
    public static void main(String[] args) {
        
        boolean t=true;
        while(t){
            Random r= new Random();
            r.nextInt(3);
            int y=r.nextInt(3);
            int x=5;
     Scanner scan= new Scanner(System.in);
        System.out.print("do you want to choose rock or paper or scissors:  ");
        String c= scan.nextLine();
        if (c.equals("rock")) {
            x=0;
        } 
        if (c.equals("paper")){
            x=1;
        }
        else{
            x=2;
        }
        if(x==(y)){
            System.out.print("tie, please choose again: ");
        }
          if(x==0 && y==1){
            System.out.print("you lose! ");
        
        }
        if(x==1 && y==0){
            System.out.print("you win! ");
        }
         if(x==2 && y==0){
            System.out.print("you lose ");
        }
         if(x==0 && y==2){
            System.out.print("you win! ");
        
        }
         if(x==1 && y==2){
            System.out.print("you lose! ");
        
        }
         if(x==2 && y==1){
            System.out.print("you win! ");
        
        }
            }
       }   }