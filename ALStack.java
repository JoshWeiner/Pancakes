import java.util.ArrayList;


public class ALStack implements Stack<T>{

	private ArrayList<T> list = new ArrayList<T>();

    public boolean isEmpty(){
		return list.size() == 0;
    }

    public T peek(){
    	return list.get(list.size() - 1);
    } 

    public T pop(){
    	return list.remove(list.size() - 1);
    }

    public void push( T x){
    	list.add(x);
    }


}
