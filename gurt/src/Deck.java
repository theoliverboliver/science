import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
         for(int x=1; x<5; x++){
            
            for(int y=1; y<14; y++){
               if(x==1){
                deck.add(new Card("clubs", y));
               } 
                if(x==2){
                deck.add(new Card("diamonds", y));
               }     
                if(x==3){
                deck.add(new Card("hearts", y));
               }    
               else{
                deck.add(new Card("spades", y));
               }
            }
        }
    }
}
