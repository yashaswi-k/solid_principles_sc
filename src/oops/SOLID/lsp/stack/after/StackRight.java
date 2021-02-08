package oops.SOLID.lsp.stack.after;

/*
 * Stack is-a list with push() pop() methods.
 * So can we create a stack by extending an ArrayList class?
 * 
 * No! This implementation violates the Liskov Substitution Principle.
 * Which states that 
 * "Objects in a program should be replaceable with instances of their subtypes
 * without altering the correctness of that program."
 * 
 * In this case ArrayList has multiple methods which stack is not supposed to have (ex clear(), get(i) etc)
 * so objects of ArrayList are not fully replaceable by the objects of stack.   
 * 
 */
public class StackRight {

	private int[] array;
	private int topPointer = 0;

	public StackRight(int size) {
		array = new int[size];
		topPointer = -1;
	}

	public void push(int a) throws Exception {
		if (topPointer == array.length - 1) {
			throw new Exception("Stack is full!");
		}

		array[++topPointer] = a;

	}

	public int pop() throws Exception {

		if (topPointer == -1) {
			throw new Exception("Stack is Empty!");
		}

		int x = array[topPointer];
		topPointer = topPointer - 1;
		return x;
	}

	public int top() {
		if (topPointer == -1) {
			return -1;
		}
		return array[topPointer];
	}

	public static void main(String[] args) throws Exception {
		StackRight st = new StackRight(100);
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		System.out.println(st.top());
	}
}