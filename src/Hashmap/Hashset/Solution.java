package src.Hashmap.Hashset;

import java.util.HashSet;


class MyHashSet {
    HashSet<Integer> hash  = new HashSet<>();
    public MyHashSet() {
        
    }
    
    
    public void add(int key) {
        hash.add(key);
    }
    
    public void remove(int key) {
        hash.remove(key);
    }
    
    public boolean contains(int key) {
        return hash.contains(key);
    }
}

public class Solution {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        System.out.println(set.contains(1));
    }
}
