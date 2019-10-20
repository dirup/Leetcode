package com.dirup.leetcode.mar30;

public class Entry<K, V> {
	K key;
	V val;
	Entry<K, V> next;
	public Entry(K key, V val, Entry<K, V> next) {
		super();
		this.key = key;
		this.val = val;
		this.next = next;
	}
	
}
