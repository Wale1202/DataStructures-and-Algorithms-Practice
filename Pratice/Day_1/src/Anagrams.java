import java.util.*;
public class Anagrams {
    public static void main(String[] args){
        String str1 = "aba";
        String str2 = "aba";

        char[] Array1 = str1.toCharArray();
        char[] Array2 = str2.toCharArray();
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        System.out.println(Arrays.equals(Array1, Array2));

    }
}
