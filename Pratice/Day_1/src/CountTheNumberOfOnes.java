public class CountTheNumberOfOnes {
    public static void main(String[]args){
        int [] arr = new int[]{1,1,0,1,0,1,1,0};
        int sum  = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println( "Sum of 1's" + " = " + sum);
    }
}
