import java.util.Arrays;

public class ArrayQueue <T> implements Queue {
	Object[]a; 
	int top;
	int bot;
	
	public ArrayQueue()
	{
		a = new Object [10];
		this.top = 0;
		this.bot = 0;
	}
	
	public void enqueue(Object item) {
		if(bot == a.length)
			growArray();
		a[bot++] = item;
	}
	public Object dequeue() throws Exception
	{
		if(empty())
			throw new Exception("empty.");
		return a[top++];
	}
	
	void growArray()
	{
		Object[] new_a = Arrays.copyOfRange(a, 0, a.length*2);
		a = new_a;
	}
	public boolean empty()
	{
		return bot == top;
	}
	
	
	
}
