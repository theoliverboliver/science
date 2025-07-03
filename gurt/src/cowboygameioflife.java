import java.util.Random;

public class cowboygameioflife {

    private static void bord(String[][] red){
        for(int x=0; x<30; x++){
            System.out.println(" ");
            for(int y=0; y<30; y++){
                red[x][y]=("- ");
                System.out.print(red[x][y]);
            }
        }
    }
    private static void pigeonsmith(String[][] gurt){
    Random r= new Random();
    r.nextInt(5);
 int y=r.nextInt(5);
 for(int x=0; x<30; x++){
        for(int d=0; d<30; d++){
 if(y==3){
    
         gurt[x][y]="O ";
        }
        
    }

 }
    }
    public static void main(String[] args) {
        String[][] bored=new String[30][30];
        bord(bored);
        pigeonsmith(bored);
    }
    
}
