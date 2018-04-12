import java.util.LinkedList;


public class LLStack<T> implements Stack<T>{

	private LinkedList<T> list = new LinkedList<T>();

    public boolean isEmpty(){
		return list.size() == 0;
    }

    public T peek(){
    	return list.getLast();
    }

    public T pop(){

        if(isEmpty()){
            return null;
        }
        else{
        	return(list.removeLast());
        }
    }

    public void push(T x){
    	list.add(x);
    }

    public String toString(){
    	String retVal = "";

		for(int i = 0; i < list.size(); i++){
			retVal += list.get(i) + " -> ";
		}

		return retVal + " -> null";
    }

}
