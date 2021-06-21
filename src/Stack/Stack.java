package Stack;

class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; 

	Stack()	{
		top = -1;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean push(int x)	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	
	public String toString() {
		String str = "";
		int i = top + 1;
		while(i >= 0) {
			str = str + "\n|" + a[i] + "|";
			i--;
		}
		return str;
	}

	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s);
		
	}
	
}
