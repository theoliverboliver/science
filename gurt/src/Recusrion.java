public class Recusrion {
    public static int fib(int sign){
      if(sign <= 1){
        return 1; 
      }
      return fib(sign - 2) + fib(sign - 1);
    }
    public static int fact(int joe){
      if(joe <= 1){
        return(1);
      }
      return joe*fact(joe-1); 
    }
  public static void main(String[] args) {
    fact(1);
    System.out.println(fact(67));
  }  
}
