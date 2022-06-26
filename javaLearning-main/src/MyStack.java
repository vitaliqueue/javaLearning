import java.util.ArrayList;
public class MyStack <T> {
    T thing;
    ArrayList<T> things;
    Integer cnt = 0;

    public MyStack (){
        things = new ArrayList<>();
        cnt = 0;
    }
    void push (T thing){
        things.add(cnt, thing);
        cnt++;
    }

void pop (Integer i){
        System.out.println(things.get(i));
        things.remove(things.size() - 1);
        System.out.println(things.toString());
}
}



