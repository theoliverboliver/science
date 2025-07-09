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
        String moveon = s.nextLine();
        if(moveon.equals("")){
        System.out.println("player one, your card is the " + hi);
        }
    
}
}   



    
    
