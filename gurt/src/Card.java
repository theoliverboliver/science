public class Card {
    private String suit;
    private int numb;

    public Card(String suit, int numb){
        this.suit=suit;
        this.numb=numb;
    }
    public String getSuit(){
        return this.suit;
    }
    public int getNumb(){
        return this.numb;
    }
    public void setSuit(String suit2){
        this.suit=suit2;
    }
    public void setNumb(int numb2){
        this.numb=numb2; 
    }
    public String toString(){
        if(numb==1){
            return "ace of "+suit;
        }
        if(numb==11){
            return "jack of " + suit;
        }
         if(numb==12){
            return "queen of " + suit;
        }
         if(numb==13){
            return "king of " + suit;
        }
         return numb+" of "+suit;
    }
}
