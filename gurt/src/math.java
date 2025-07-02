import java.util.Scanner;

public class math {
    private static  int add(int x, int y){
        return x+y;
    }
    private static  int sub(int x, int y){
        return x-y;
    }
    private static  int mult(int x, int y){
        return x*y;
    }
    private static  int div(int x, int y){
        return x/y;
    }
    public static void main(String[] args){
     System.out.println("would you like to +, -, *, or /");
     Scanner eye= new Scanner(System.in);
     String sym= eye.nextLine();
     System.out.println("Now choose first nuumber");
     int first= eye.nextInt();
     System.out.println("aight now second number");
     int sec= eye.nextInt();
     System.out.println("ok heres what u get");
     if(sym.equals("+")){
        int r=add(first, sec);
        System.out.println(r);
     }
      if(sym.equals("-")){
        int r=sub(first, sec);
        System.out.println(r);
     }
      if(sym.equals("-")){
        int r=mult(first, sec);
        System.out.println(r);
     }
      if(sym.equals("/")){
        int r=div(first, sec);
        System.out.println(r);
     }
     }
    }