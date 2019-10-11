import java.util.Arrays;

public class ArrayStack <T> implements Stack {
	protected int top;
	protected Object []a;
	
	public ArrayStack()
	{
		a = new Object[10];
		top = -1;
	}
	public boolean empty()
	{
		return top==-1;
	}
	public Object peek() throws Exception
	{
		if(empty())
			throw new Exception("Empty.");
		return a[top];
	}
	public Object pop() throws Exception
	{
		if(empty())
			throw new Exception("Empty.");
		return a[top--];
	}
	public void push(Object item)
	{
		if(a.length-1 == top)
			growArray();
		a[++top] = item;
	}
	void growArray()
	{
		Object[] new_a = Arrays.copyOfRange(a, 0, a.length*2);
		a = new_a;
	}
	
}
