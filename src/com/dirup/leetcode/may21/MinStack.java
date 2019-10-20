package com.dirup.leetcode.may21;

public class MinStack {

	class Node{
		int val;
		int min;
		Node next;
		
		public Node(int x, int y) {
			val = x;
			min = y;
		}
	}
	public static void main(String[] args) {
		
	}
	
	public Node top;
	public void push(int x)
	{
		if(top == null)
		{
			top = new Node(x,x);
		}
		else {
			Node node = new Node(x,Math.min(x, top.min));
			node.next = top;
			top = node;
		}
	}
	
	public void pop()
	{
		
	}

}
