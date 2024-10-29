import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] rearr = new int[arr.length];

        for (int i = 0; i < rearr.length; i++) {
            rearr[i] = arr[arr.length - i - 1];
        }
        
        System.out.println(Arrays.toString(rearr));
        
    }
}
