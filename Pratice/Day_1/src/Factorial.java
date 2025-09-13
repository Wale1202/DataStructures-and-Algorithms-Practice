public class Factorial {
    public static void main(String[] args){
        int fact = 1;
        int num = 5;
        if(num <0){
            System.out.println("Factorial can't be calculated with negative number");
        }
        if(num == 0){
            System.out.println("Factorial of 0 is " + 1);
        }
        for ( int i = 1; i<= num; i++ ){
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}
