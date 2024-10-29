import java.util.Arrays;
public class SortIntegers {
    public static void main(String[] args) {
        Integer[] numbers = {5,4,6,3,2};
        Arrays.sort(numbers,(a,b) -> Integer.compare(a,b));
        System.out.println("sorted Array:" + Arrays.toString(numbers));
    }
    
}
