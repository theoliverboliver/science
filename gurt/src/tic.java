import java.util.Scanner;

public class tic {

    public static void main(String[] args) {
        String[][] board = new String[3][3];
        for (int x = 0; x < 3; x++) {
            System.out.println(" ");
            for (int y = 0; y < 3; y++) {
                board[x][y] = "- ";
               
            }
        }
        int turn=0;
        while (true) {
               
                while(true)  {
                    for (int x = 0; x < 3; x++) {
                System.out.println(" ");
                for (int y = 0; y < 3; y++) {
                    System.out.print(board[x][y]);
                }}
                System.out.println("alr player 1 yo what x coord do u wanna choose:");
                    Scanner scran = new Scanner(System.in);
                    int first = scran.nextInt();
                    System.out.println("aight what abt y coord:");
                    int sec = scran.nextInt();
                    if(board[first][sec].equals("x ") || board[first][sec].equals("o ") ){
                        System.out.println("spot is already taken you idiot");
                    }
                   if(board[first][sec].equals("- ")){
                      board[first][sec] = "x ";
                       turn++; 
                        break;  
                                       
                        }
                    }
                    if(board[0][0].equals("x ") && board[1][0].equals("x ") && board[2][0].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[0][0].equals("x ") && board[1][1].equals("x ") && board[2][2].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[0][0].equals("x ") && board[0][1].equals("x ") && board[0][2].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[0][1].equals("x ") && board[1][1].equals("x ") && board[2][1].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[0][2].equals("x ") && board[1][2].equals("x ") && board[2][2].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[0][2].equals("x ") && board[1][1].equals("x ") && board[2][0].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[2][2].equals("x ") && board[2][1].equals("x ") && board[2][0].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(board[1][0].equals("x ") && board[1][1].equals("x ") && board[2][1].equals("x ")){
                System.out.println("player 1 wins!");
                break;
            }
            if(turn==9){
                break;
            }
                 while(true){
                     for (int x = 0; x < 3; x++) {
                System.out.println(" ");
                for (int y = 0; y < 3; y++) {
                    System.out.print(board[x][y]);
                }}
                    System.out.println("player 2 choose an x coord:");
                      Scanner scran = new Scanner(System.in);
                    int firsts = scran.nextInt();
                    System.out.println("player 2 also y coord:");
                    int sect = scran.nextInt();
                    if(board[firsts][sect].equals("x ") || board[firsts][sect].equals("o ") ){
                        System.out.println("spot is already taken idiot");
                    }
                   if(board[firsts][sect].equals("- ")){

                    board[firsts][sect] = "o ";
                    turn++;
                    break;
                    
                   }
                }
            
             if(board[0][0].equals("o ") && board[1][0].equals("o ") && board.equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[0][0].equals("o ") && board[1][1].equals("o ") && board[2][2].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[0][0].equals("o ") && board[0][1].equals("o ") && board[0][2].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[0][1].equals("o ") && board[1][1].equals("o ") && board[2][1].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[0][2].equals("o ") && board[1][2].equals("o ") && board[2][2].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[0][2].equals("o ") && board[1][1].equals("o ") && board[2][0].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[2][2].equals("o ") && board[2][1].equals("o ") && board[2][0].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            if(board[1][0].equals("o ") && board[1][1].equals("o ") && board[2][1].equals("o ")){
                System.out.println("player 2 wins!");
                break;
            }
            
        }}}
            
