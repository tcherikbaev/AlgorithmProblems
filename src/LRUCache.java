import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
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
