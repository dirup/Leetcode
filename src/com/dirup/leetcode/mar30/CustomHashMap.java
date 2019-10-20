package com.dirup.leetcode.mar30;

public class CustomHashMap<K, V> {
	private Entry<K, V>[] buckets;
	int capacity = 16;
	private int size = 0;
	public CustomHashMap()
	{
		buckets = new Entry[capacity];
	}
	
	public void put(K key, V val) {
		Entry<K, V> entry = new Entry<K,V>(key, val, null);
		int bucket = getHash(key) % capacity;//hash(key)
		Entry<K,V> existing = buckets[bucket];
		if(existing == null) {
			buckets[bucket] = entry;
			size++;
		}
		else {
			while(existing.next !=null) {
				if(existing.key.equals(key)) {
					existing.val = val;
					return;
				}
				existing = existing.next;
			}
			if(existing.key.equals(key))
			{
				existing.val = val;
			}
			else {
				existing.next = entry;
				size++;
			}
			
		}
		
		
		
	}
	public V get(K key) {
		int bucket = getHash(key) % capacity;
		Entry<K, V> existing = buckets[bucket];
		if(existing.key.equals(key)) // no need of this if condition any way we are checking in while loop
			return existing.val;
		else {
			while (existing!=null)
			{
				if(existing.key.equals(key))
					return existing.val;
				else
					existing = existing.next;
			}
		}
		return null;
		
	}

	private int getHash(K key) {
		// TODO Auto-generated method stub
		return key.hashCode();
	}
}
