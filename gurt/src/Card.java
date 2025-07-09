public class Card {
    private String suit;
    private int number;
    
    public Card(String suit, int number){
        this.suit=suit;
        this.number=number;
    }
    public Card(){
        this.suit="spades";
        this.number= 6;
    }
    public String getSuit(){
        return this.suit;
    }
    public void setSuit(String x){
        this.suit=x;
    }
    public int getNumber(){
        return this.number;
    }
    public void setNumber(int z){
        this.number=z;
    }
    public String toString(){
        if(number==1){
            return "ace of " + suit;
        }
        if(number==11){
            return "jack of " + suit;
        }
        if(number==12){
            return "queen of " + suit;
             }
        if(number==13){
            return "king of " + suit;
        }
       
        return number + " of " + suit;
    }
    
}
