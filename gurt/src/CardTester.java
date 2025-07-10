import java.util.ArrayList;
import java.util.Scanner;
public class CardTester {

    public static void main(String[] args) {
        Deck hi= new Deck();
        hi.shuffle();
        ArrayList<Card > playerone= new ArrayList<Card>();
         ArrayList<Card > playertwo= new ArrayList<Card>();
       for(int x=0; x<26; x++){
         playerone.add(hi.getter().get(x));
       }
       for(int y=26; y<52; y++){
        playertwo.add(hi.getter().get(y));

       }
        System.out.println("hello welcome to war. from now on please input enter to move forward in the game.");
        Scanner s= new Scanner(System.in);
      
        
      while(true){
        if(playertwo.size()==0){
          System.out.println("player one wins!!!");
          break;
        }
        if(playerone.size()==0){
          System.out.println("player two wins!!!");
          break;
        }
       Card x = playerone.remove(0);
       Card z = playertwo.remove(0);
       if(x.getNumber() < z.getNumber()){
        System.out.println("you win that round");
        
          playerone.add(x);
          playerone.add(z);
       }
       else if(x.getNumber() > z.getNumber()){
        System.out.println("you lose that round");
          playertwo.add(x);
          playertwo.add(z);
       }
       else{
        ArrayList<Card> temp = new ArrayList<>();
        System.out.println("its a tie!!! each side draw four cards, whoevers fourth card is bigger wins the tie.");
        if(playerone.size()<4){
          System.out.println("you do not have enough cards for war, so player two wins.");
          break;
        }
        if(playertwo.size()<4){
          System.out.println("player two does not have enough cards for war, so you win.");
          break;
        }
        temp.add(playerone.remove(0));
        temp.add(playerone.remove(0));
        temp.add(playerone.remove(0));
     
        temp.add(playertwo.remove(0));
        temp.add(playertwo.remove(0));
        temp.add(playertwo.remove(0));
       
        if(x.getNumber() > z.getNumber()){
          System.out.println("you won the war!");
          playerone.add(temp);
        }
       }
          String moveon = s.nextLine();
        System.out.println("player one, your card is the " + playerone.get(0));
        System.out.println("player two's card is the " + playertwo.get(0));
      System.out.println("you have " +  playerone.size() + " cards.");
         System.out.println("your opponent has " + playertwo.size() + " cards.");
      }

        }
      
}




    
    
