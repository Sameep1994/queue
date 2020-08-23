import java.util.LinkedList;
import java.util.Queue;

public class GenerateNNumWithGivenDigit {
    public static Queue<String> q = new LinkedList<>();
    public static void main(String[] args) {
        gen(10);
    }
 //here we have to generate n numbers with given digit eg5,6
 //if we have to generate 4 num with 5 and 6 it will be 5,6,55,56 and so on
 //to solve this we are having 5 and 6 as string and enqueue it
 //pop the first element appending 5 and 6 to it and enqueue it again till we generate n numbers

    public static void gen(int n){
        q.add("5");
        q.add("6");
        for(int i=0;i<n;i++){
            String s =q.peek();
            System.out.println(s);
           q.poll();
           q.add(s+"5");
           q.add(s+"6");
        }

    }
}
