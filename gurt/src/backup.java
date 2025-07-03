import java.util.Scanner;

public class backup {
    
    private static void marty(String[][] x){
        for (int b = 0; b < 6; b++) {
             System.out.println(" ");
            for (int y = 0; y < 7; y++) {
                 x[b][y] = "⚪ ";
                 System.out.print(x[b][y]);
                 
            } }}
    private static void table(String[][] x){
        
        for (int b = 0; b < 6; b++) {
            System.out.println(" ");
            for (int y = 0; y < 7; y++) {
              
                 System.out.print(x[b][y]);
            }     }   }
    
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
        private static int ok(String[][] n, int win, boolean frue){

            int check=0;
         for( int o=0; o<6; o++){
            for(int p=0; p<4; p++){
          if(n[o][p].equals("🔴 ") || n[o][p].equals("🟡 ")){
                if(n[o][p].equals(n[o][p+1]) && n[o][p+1].equals(n[o][p+2]) && n[o][p+2].equals(n[o][p+3])){
           
            check=5;
           }    }     }    }
         for( int o=0; o<3; o++){
            for(int p=0; p<7; p++){
           if(n[o][p].equals("🔴 ") || n[o][p].equals("🟡 ")){
                if(n[o][p].equals(n[o+1][p]) && n[o+1][p].equals(n[o+2][p]) && n[o+2][p].equals(n[o+3][p])){
          
             check=5;
           }    }     }  }
     for( int o=0; o<3; o++){
            for(int p=0; p<4; p++){
           if(n[o][p].equals("🔴 ") || n[o][p].equals("🟡 ")){
                if(n[o][p].equals(n[o+1][p+1]) && n[o+1][p+1].equals(n[o+2][p+2]) && n[o+2][p+2].equals(n[o+3][p+3])){
           
                         check=5;
   }} }}
    for( int o=4; o<6; o++){
            for(int p=0; p<4; p++){
                if(n[o][p].equals("🔴 ") || n[o][p].equals("🟡 ")){
                if(n[o][p].equals(n[o-1][p+1]) && n[o-1][p+1].equals(n[o-2][p+2]) && n[o-2][p+2].equals(n[o-3][p+3])){
                         check=5;
           }
        }
        }
    }
    if(check==5){
    if(win%2==0){
        System.out.println("player 2 wins!!");
        return 1;
    }
    else{
        System.out.println("player 1 wins!!!");     
        return 1;
    }}
        return 2;
    }
    public static void main(String[] args) {
          int e=0;
        int win=0;
        String[][] board= new String[6][7];
         marty(board);
         while(true){      
        win++;
        Scanner eye= new Scanner(System.in);
        if(win%2==0){
            System.out.println("player 2 choose a column:");
        }
        else{
            System.out.println("player 1 choose a column:");
        }
       e++;
          int red= eye.nextInt();
          board=ahh(red, board, e);  
            ok(board, win, true);
           int r=ok(board, win, true);
           if(r==1){
            break;
}}} }