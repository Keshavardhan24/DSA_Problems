public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,99};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
    }
    
}