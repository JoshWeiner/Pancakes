import java.util.LinkedList;

//********** finish ALStack first
public class LLStack implements Stack<String>{

	LinkedList list = new LinkedList();

    public boolean isEmpty(){
		return list.size() == 0;
    }


}
