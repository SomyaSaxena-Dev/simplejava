
import java.util.Stack;

public class FindMinValueInStack extends Stack<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Stack<Integer> stack = new Stack<>(); 
    
    /* SpecialStack's member method to insert an element to it. This method 
    makes sure that the min stack is also updated with appropriate minimum 
    values */
    void push(int x) 
    { 
        if(isEmpty() == true) 
        { 
            super.push(x); 
            stack.push(x); 
        } 
        else
        { 
            super.push(x); 
            int y = stack.pop(); 
           // stack.push(y); 
            if(x < y) 
                stack.push(x); 
            else
                stack.push(y); 
        } 
    } 
  
    /* SpecialStack's member method to insert an element to it. This method 
    makes sure that the min stack is also updated with appropriate minimum 
    values */
    public Integer pop() 
    { 
        int x = super.pop(); 
        stack.pop(); 
        return x; 
    } 
  
    /* SpecialStack's member method to get minimum element from it. */
    int getMin() 
    { 
        int x = stack.pop(); 
        stack.push(x); 
        return x; 
    } 

	public static void main(String[] args) {
		
		FindMinValueInStack s = new FindMinValueInStack();
		s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(30); 
        s.push(0); 
        s.push(30); 
        s.push(430); 
        s.push(30); 
        s.push(30); 
        s.push(340); 
        
        System.out.println(s.getMin()); 
	}

}
