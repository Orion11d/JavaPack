//work with stack

package test.test3;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
	
	Stack<String> stack = new Stack();
	stack.push("first");
	stack.push("second");
	stack.push("third");
	
	String s;
	
	while (!stack.isEmpty()) {
		s = stack.pop();
		System.out.println(s + " ");
		}
	}
}
