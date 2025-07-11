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
       if(x.getNumber() > z.getNumber()){
        System.out.println("you win that round");
        
          playerone.add(x);
          playerone.add(z);
       }
       else if(x.getNumber() < z.getNumber()){
        System.out.println("you lose that round");
          playertwo.add(x);
          playertwo.add(z);
       }
       else{
        System.out.println("war time");
        ArrayList<Card> temp = new ArrayList<>();
        System.out.println("its a tie!!! each side draw four cards, whoevers fourth card is bigger wins the tie.");
        while(true){
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

          Card a = playerone.remove(0);
          Card c = playertwo.remove(0);
          System.out.println("Temp:");
          for(Card h: temp) {
            System.out.println(h);
          }
          
          System.out.println("A: "+ a);
          System.out.println("C: " + c);
          System.out.println("your opponent drew a " + c + ", you drew a " + a);
          if(a.getNumber() > c.getNumber()){
            System.out.println("you won the war!");
            for(Card blemp: temp  ){
              playerone.add(blemp);
            }
            playerone.add(a);
            playerone.add(c);
           
            break;
          }
          else if(a.getNumber() < c.getNumber()){
            System.out.println("you lost the war");
            for(Card blemp: temp  ){
              playertwo.add(blemp);
            }
            playertwo.add(a);
            playertwo.add(c);
            break;
          }
          else{
            temp.add(a);
            temp.add(c);
            System.out.println("well ill be damned, we got a stacked war!!!");
          }
        }
      }
          String moveon = s.nextLine();
           System.out.println("you have " +  playerone.size() + " cards.");
         System.out.println("your opponent has " + playertwo.size() + " cards.");
        System.out.println("player one, your card is the " + playerone.get(0));
        System.out.println("player two's card is the " + playertwo.get(0));
     
      }

        }
      
}




    
    
