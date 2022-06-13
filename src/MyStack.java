
import java.util.ArrayList;
public class MyStack <T> {
    T thing;
    ArrayList<T> things;
    Integer cnt = 0;

    MyStack (){
        things = new ArrayList<>();
        cnt = 0;
    }
    void push (T thing){
        things.add(cnt, thing);
        cnt = cnt+1;
    }
    void pop (){
        for (Integer i = things.size()-1; i >= 0; i--) {
            System.out.println(things.get(i));
        }
    }
}


