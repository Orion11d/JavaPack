//Go with class LinkedList 

package test.tes2;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueTest {
	public static void main(String[] args){
	Queue<String> queue = new LinkedList<>();
	queue.add("first");
	queue.add("second");
	
	String s;
	while ((s = queue.poll()) != null)
	System.out.println(s + " "); // first second
	}
}