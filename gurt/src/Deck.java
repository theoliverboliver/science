import java.util.ArrayList;
public class Deck {
    public ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();
         for(int x=1; x<5; x++){
            
            for(int y=1; y<14; y++){
               if(x==1){
                deck.add(new Card("clubs", y));
               } 
               else if(x==2){
                deck.add(new Card("diamonds", y));
               }     
                else if(x==3){
                deck.add(new Card("hearts", y));
               }    
               else {
                deck.add(new Card("spades", y));
               }
            }
        }
    }
    public void shuffle(){
       
        for(int x=0; x<52; x++){
            int rand=(int)(Math.random()*52);
            Card save=deck.get(rand);
            Card y= deck.get(x);
            deck.set(rand, y);
            deck.set(x, save);
        }
    }
    public void printDeck(){
        for(Card xvur: deck){
            System.out.println(xvur);
        }
    }      
    public ArrayList<Card> getter(){
        return deck;
    }
}
