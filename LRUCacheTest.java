import java.util.*;

class LRUCache
 {
    int capacity;
    Deque<Integer> q = new ArrayDeque<>(); 
    Map<Integer, Integer> map = new LinkedHashMap<>(); 

    public LRUCache(int capacity)
     {
        this.capacity = capacity;
    }

    public int get(int key)
    {
        if (map.containsKey(key))
        {
           
            q.remove(key);
            q.offer(key); 
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value)
     {
        if (map.containsKey(key))
        {
           
            q.remove(key); 
            q.offer(key); 
            map.put(key, value);
        } else {
            if (q.size() < capacity)
            {
                q.offer(key);
            } else {
                map.remove(q.poll()); 
                q.offer(key);
            }
            map.put(key, value); 
        }
    }
}

public class LRUCacheTest
 {
    public static void main(String[] args)
    {
        LRUCache cache = new LRUCache(3); 

        cache.put(1, 10); 
        cache.put(2, 20); 
        cache.put(3, 30); 
        System.out.println(cache.get(1)); 

        cache.put(4, 40);

        System.out.println(cache.get(5)); 
    }
}