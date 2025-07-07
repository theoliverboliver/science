public class BinarySort {
    public static int _halfer(int[] list, int lower, int upbaby, int target){
        int midMango= (upbaby + lower) / 2;
        if(list[midMango]==target){
            return midMango;
        }
        if(list[midMango]<target && target <= list[upbaby]){
            return _halfer(list, midMango+1, upbaby, target);
        }
         if(list[midMango]>target && target >= list[lower]){
             return _halfer(list, lower, midMango-1, target);
        }
        return -1;
    }
    public static int halfer(int[] list, int target){
        return _halfer(list, 0, list.length-1, target);
    }
     public static void main(String[] args) {
        int[] hi = {1, 12, 23, 33, 48, 54, 67, 80};
        
        int index=halfer(hi, 200);
        System.out.println(index);
     }
}