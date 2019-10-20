package com.dirup.leetcode.june25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class WordNode{
    String word;
    int numSteps;
 
    public WordNode(String word, int numSteps){
        this.word = word;
        this.numSteps = numSteps;
    }
}
 
 class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(beginWord, 1));
 
        wordDict.add(endWord);
 
        while(!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;
 
            if(word.equals(endWord)){
                return top.numSteps;
            }
 
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                for(char c='a'; c<='z'; c++){
                    char temp = arr[i];
                    if(arr[i]!=c){
                        arr[i]=c;
                    }
 
                    String newWord = new String(arr);
                    if(wordDict.contains(newWord)){
                        queue.add(new WordNode(newWord, top.numSteps+1));
                        wordDict.remove(newWord);
                    }
 
                    arr[i]=temp;
                }
            }
        }
 
        return 0;
    }
    
public int ladderLength2(String beginWord, String endWord, Set<String> wordList) {
        
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        int count = 1;
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            for(int j = 0; j < size; j++){
                String word = queue.remove();
                
                if(word.equals(endWord)){
                    return count;
                }
                
                for(int i = 0; i < word.length(); i++){
                    for(char c = 'a'; c <= 'z'; c++){
                        if(c != word.charAt(i)){
                            char[] s = word.toCharArray();
                            s[i] = c;
                            String trans = new String(s);
                            
                            if(wordList.contains(trans)){
                                queue.add(trans);
                                wordList.remove(trans);
                            }
                        }
                    }
                }
            }
            
            count++;
        }
        
        return 0;
    }
}
