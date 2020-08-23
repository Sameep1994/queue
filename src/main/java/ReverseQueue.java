import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        rev(q);
        System.out.println(q);
    }
//here we are using a stack to reverse the order, same can be achieved by recursion
    public static void rev(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        while(q.isEmpty()==false){
            s.push(q.poll());
        }
        while (s.empty()==false){
            q.add(s.pop());
        }
    }
}
