import java.util.*;
public class ArrayRotation {
    private static void rotate(int[] arr, int k){
        k = k % arr.length;
        for(int i = 0; i < k; i++){
            int temp = arr[0];
            for(int j = 0; j < arr.length-1; j++){
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        rotate(arr, 2);
//        for(int num : arr){
//            System.out.println( num + "");
//        }

    }
}
