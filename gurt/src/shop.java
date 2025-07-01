import java.util.Scanner;

public class shop {
     public static void main(String[] args){
 String[] arry=new String[14];
 int x=-1;
 while(true){
 System.out.println("would you like too 'add', 'remove', or 'see' yuor shopping list?");
 Scanner scran= new Scanner(System.in);
 String track=scran.nextLine();
 if(track.equals( "see")){
    System.out.println("here is your shopping list currently:");
    for(int p=0; p<14; p++){
    System.out.println(arry[p]);
 }
}
 if(track.equals("add")){
    System.out.println("what do u want to add?");
    x++;
    arry[x]= scran.nextLine();
 }
 if(track.equals("remove")){
    System.out.println("which line do u want to remove?");
     int rem=scran.nextInt();
     arry[rem+1]=null;

 }
}
}
}