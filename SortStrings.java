import java.util.Arrays;
public class SortStrings {
    public static void main(String[] args) {
        String[] words = {"apple","banana","kiwi","grapes","mango"};
        Arrays.sort(words,(a,b) -> Integer.compare(a.length(),b.length()));
        System.out.println(Arrays.toString(words));
    }
}
