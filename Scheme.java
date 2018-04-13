/*****************************************************
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 ******************************************************/

public class Scheme
{

  /******************************************************
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   ******************************************************/

  //NOTE THIS METHOD ASSUMES THAT THERE ARE NO "/"" Operators

  public static String evaluate( String expr ) {
      ALStack<Integer> stack = new ALStack<Integer>();

      String[] arr = expr.split("\\s+");

      for(int i = arr.length - 1; i > 0; i--){

        if(isNumber(arr[i])){
          stack.push(Integer.parseInt(arr[i]));
        }
        else if(arr[i].equals("+")){
            int sum = stack.pop() + stack.pop();
            stack.push(sum);                    
        }
        else if(arr[i].equals("-")){ 
          int op0 = stack.pop();
          int op1 = stack.pop();
          int difference = op1 - op0;
          stack.push(difference);          
        }
        else if(arr[i].equals("*")){
          int product = stack.pop() * stack.pop();
          stack.push(product);
        }
        }//end for loop

        String finalAnswer = Integer.toString(stack.pop());
        return finalAnswer;
  }//end evaluate()


  /******************************************************
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   ******************************************************/
  public static String unload( int op, Stack<String> numbers )
  {
      return "String";
  }//end unload()


  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
	   }
    catch( NumberFormatException e ) {
      return false;
	   }
  }


  //main method for testing
  public static void main( String[] args )
  {


      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4


      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main

}//end class Scheme
