import java.util.*;
public class MinimizeCoins {
    public static List<Integer> minimizeCoins(int amount , Integer[] coins){
        Arrays.sort(coins,(a,b) -> Integer.compare(b,a));
        List<Integer> change = new ArrayList<>();
        for(int coin : coins)
        {
            while(amount >= coin)
            {
                amount -= coin;
                change.add(coin);
            }
        }
        return change;
    }
    public static void main(String[] args) {
        int amount = 1995;
        Integer[] coins = {1,2,5,10,20,50,100,200,500};

        List<Integer> purse = minimizeCoins(amount,coins);
        System.out.println(purse);
    }
}
