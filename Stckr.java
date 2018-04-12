/*****************************************************
 * class Stckr
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 *****************************************************/

public class Stckr 
{
    public static void main( String[] args )
    {

    //only uncomment one of these at a time...
	Stack<String> cakes = new ALStack<String>();
	//Stack<Z> cakes = new LLStack<Z>();

	System.out.println(cakes.pop()); //tests to see if pop() works on empty list
	cakes.push("a");
	cakes.push("b");
	cakes.push("c");
	System.out.println(cakes);

	cakes.pop();
	System.out.println(cakes);


	//...
	
    }//end main

}//end class

