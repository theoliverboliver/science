import java.util.Scanner;

public class connect35 {
    
    private static void marty(String[][] x){
        for (int b = 0; b < 6; b++) {
           
            for (int y = 0; y < 7; y++) {
                 x[b][y] = "⚪ ";
                 
            }
    }
}
    private static void table(String[][] x){
        
        for (int b = 0; b < 6; b++) {
            System.out.println(" ");
            for (int y = 0; y < 7; y++) {
              
                 System.out.print(x[b][y]);
            }
        }
    }
    
    private static String[][] ahh(int t, String[][] m, int gurt){
        int x=5;
        
        if(m[x][t].equals("🟡 ") || m[x][t].equals("🔴 ")){
            while (m[x][t].equals("🟡 ") || m[x][t].equals("🔴 ")) { 
                x--;
            }
        }
        if(gurt%2==0){
             m[x][t]="🟡 ";
        }
        else{
        m[x][t]="🔴 ";
        }
        table(m);

        return(m);
        }
    public static void main(String[] args) {
          int e=0;
    
        String[][] board= new String[6][7];
         marty(board);
         while(true){
        
        int x=1;
        Scanner eye= new Scanner(System.in);
        System.out.println("player " + x + " please select a column.");
       e++;
          int red= eye.nextInt();
          board=ahh(red, board, e);
            
         }
        
    
}
}