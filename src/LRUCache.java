import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class LRUCache {
    public static void main(String[] args) {
        // Create a new LRUCache with capacity 2
        LRUCache cache = new LRUCache(2);

        // Test the get and put methods
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // Output: 1
        cache.put(3, 3);
        System.out.println(cache.get(2)); // Output: -1
        cache.put(4, 4);
        System.out.println(cache.get(1)); // Output: -1
        System.out.println(cache.get(3)); // Output: 3
        System.out.println(cache.get(4)); // Output: 4
    }
    private int capacity;
    private Map<Integer, Integer> cache;
    private Deque<Integer> queue;
    public LRUCache(int capacity)
    {
        this.capacity=capacity;
        cache=new HashMap<>();
        queue=new LinkedList<>();
    }
    public int get (int key)
    {
        if(cache.containsKey(key))
        {
            queue.remove(key);
            queue.addFirst(key);
            return cache.get(key);
        }
        return -1;
    }
    void put (int key, int value)
    {
        if(cache.containsKey(key))
        {
            queue.remove(key);

        }else if(cache.size()>=capacity)
        {
            int LastRecentUsed=queue.removeLast();
            cache.remove(LastRecentUsed);
        }
        queue.addFirst(key);
        cache.put(key,value);
    }
    }
