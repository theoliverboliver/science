import java.util.Random;

public class cowboygameioflife {
    private static String[][] pigeonSmith(String[][] gurt){
        for(int x=0; x<30; x++){
            for(int d=0; d<30; d++){
                int randing=(int)(5*Math.random())+1;
                if(randing==3){
                gurt[x][d]="O ";
                }   
            }
        }
        return gurt;
    }
    private static void printBored(String[][] jackFein){
        for(String[] x: jackFein){
            System.out.println(" ");
            for(String y: x){
                System.out.print(y);

            }
        }
    }
    private static String[][] updateBoard(String[][] board){

    }
    public static void main(String[] args) {
        String[][] bored=new String[30][30];
        for(int x=0; x<30; x++){
            System.out.println(" ");
            for(int y=0; y<30; y++){
                bored[x][y]=("- ");
               
            }
        }
        bored = pigeonSmith(bored);
         printBored(bored);
        
    }
    
}
