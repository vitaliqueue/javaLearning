import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MyStack sampleStack = new MyStack();
        sampleStack.push(1223);
        sampleStack.push(2.452);
        sampleStack.push("awd");
        sampleStack.push(true);
        sampleStack.push(12342434);

        //for (Integer i = sampleStack.things.size()-1; i >= 0; i--) {
        //  System.out.println(sampleStack.things.get(i));
        //}
        //System.out.println(sampleStack.things);

        sampleStack.pop();
    }
}