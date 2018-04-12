import java.util.ArrayList;


public class ALStack<T> implements Stack<T>{

	private ArrayList<T> list = new ArrayList<T>();

    public boolean isEmpty(){
		return list.size() == 0;
    }

    public T peek(){
    	return list.get(list.size() - 1);
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        else{
    	   return list.remove(list.size() - 1);
        }
    }

    public void push( T x){
    	list.add(x);
    }

    public String toString(){
        String retVal = "[";
        for(int i = 0; i < list.size(); i++){
            retVal = retVal + list.get(i) + ",";
        }
        return retVal.substring(0, retVal.length() - 1) + "]";
    }


}
