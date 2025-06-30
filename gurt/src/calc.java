
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
    boolean t=true;
        while(t){
     Scanner scan= new Scanner(System.in);
      System.out.print("select first number: ");
      int n= scan.nextInt();
      scan.nextLine();
     System.out.print("select a symbol: +, -, *, /, %: ");
     String x= scan.nextLine();
     System.out.print("select second number: ");
   
      int o= scan.nextInt();
      if(x.equals("+")){
        System.out.print(n+o+"  ");
      }
      scan.nextLine();
      if(x.equals("-")){
        System.out.print(n-o+"  ");
      }
      if(x.equals("*")){
        System.out.print(n*o+"  ");
      }
      if(x.equals("/")){
        System.out.print(n/o+"  ");
      }
      if(x.equals("%")){
        System.out.print(n%o+"  ");
      }
      System.out.print("do you want to keep calculating? please select yes or no: ");
      String e= scan.nextLine();
      if(e.equals("no")){
        t=false;
      }

      else{
      }
    }
} 
}