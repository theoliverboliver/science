import java.util.Scanner;
public class Funlalala {
    public static void main(String[] args) {
        while(true){
        journey();
      int x=  cave();
        if(x==5){
            break;
        }
    }
    }
    private static void journey(){
        System.out.println("hear ye hear ye, I am ronnie, thy one who may not be shall forth come upon ones mischevious action. art thou confirm? (yes) or (yes)");
    Scanner glasses= new Scanner(System.in);
    String fr = glasses.nextLine();
    
    if(fr.equals("yes")){
        System.out.println("marvelous! maybe we can exchange hands upon our journey. ;) *he winks at you. a sudden feeling of  love, nervousness, and excitement rushes through your body*");
        return;
    
    }
    if(fr.equals("no")){
        System.out.println("oh what a shame, i thought we could become friends, or maybe more than that");
        return;
    }
}
    
     private static int cave(){
        System.out.println("after a while of walking, both you and Ronnie get tired, so you two decide to sleep in a cave for the night.");
                System.out.println("You too sleep, he falls asleep first, and all you can think about is ronnie!");
                 System.out.println("you look to your left, and you notice hes right next to you, practically hugging you.");
                 System.out.println("do you (1) back away, or (2) sleep just the way you are.");
                 Scanner glasses= new Scanner(System.in);
                    String fr = glasses.nextLine();
                    if(fr.equals("1")){
                      System.out.println("you wake up and ronnie is gone! you totally blew it");  
                        return 5;
                    }
                    else if(fr.equals("2")){
                        System.out.println("you two wake up, and ronnie is a little startled by it, but he doesnt seem upset.");
                          System.out.println("you feel so warm and happy inside, all you want to do is be with him forever");
                           System.out.println("he leans in for a kiss... do you (1) lean in as well or (2) kiss him");
                            String br = glasses.nextLine();
                        if(br.equals("1") || br.equals("2")){
                            System.out.println("after, you too are both a little suprised but in a good way. Ronnie won't stop blushing, and neither will yo!");
                            System.out.println("you two continue the journey, and would occasionally hold each others hand. Your bond with him is getting stronger!");
                             System.out.println("you guys finally reach your destination, and you both are in shock. you two grab each others hands, and walk in together.");
                            System.out.println("to be continued...");
                            return 5;

                        }
                    }
                
return 5;
}
}
