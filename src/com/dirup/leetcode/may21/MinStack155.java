package com.dirup.leetcode.may21;

import java.util.Stack;

public class MinStack155 {

	int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) {
        	System.out.println(stack.peek());
        	min=stack.pop();
        }
    }

    public int top() {
    	System.out.println(stack.peek());
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
	public static void main(String[] args) {
		MinStack155 ms = new MinStack155();
		ms.push(0);
		ms.push(-3);
		ms.push(-2);
		ms.push(1);
		ms.push(2);
		//ms.push(-4);
		ms.pop();
		ms.pop();
		ms.top();
		ms.getMin();
	}

}
