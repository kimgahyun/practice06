package prob4;

public class MyStack implements Stack {

	private String[] buffer;
	private int top;
	private int cap;
	
	
	public MyStack( int cap )
	{
		resize( cap );
	}
	
	public String[] getBuffer() {
		return buffer;
	}

	public void setBuffer(String[] buffer) {
		this.buffer = buffer;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public MyStack() {
		// TODO Auto-generated constructor stub
	}

	private void resize( int cap ) { 
 		String[] copyBuffer = new String[ cap ]; 
 		for( int i = 0; i < top; i++ ) { 
 			copyBuffer[ i ] = buffer[ i ]; 
 		} 
 		 
 		buffer = copyBuffer; 
 		this.cap = cap; 
 	} 
	
	

	
	@Override
	public void push(String item) {
		if( size() == buffer.length )
		{
			resize( cap*2 );
		}
		buffer[top++] = item;
	}

	@Override
	public String pop() throws MyStackException {

		if( isEmpty() )
		{
			throw new MyStackException( "stack is empty" );
		}
		return buffer[--top];
	}

	@Override
	public boolean isEmpty() {
		if( top == 0 )
		{
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}

}
