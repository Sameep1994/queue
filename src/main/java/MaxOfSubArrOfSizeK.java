import java.util.Deque;
import java.util.LinkedList;

public class MaxOfSubArrOfSizeK {
    public static void main(String[] args) {
        int a[]={20,40,30,10,60};
        maxSub(a,3);
    }
    /*Insert an element in dq if a element greater than
    * front of dq we empty dq and add the element in front of dq
    * when either dq of size k is completly filled or
    * we find a greater element than front we put the front element of dq in result
    *
    * */







//we need to find the max element in every subarray of size k
//we will use dequeue and all all the small element and whenever encounter a largest element we will remove all from dequeue
    public static void maxSub(int[] a,int k){
        Deque<Integer> dq= new LinkedList<>();
        //creating the deque for first window
        for(int i=0;i<k;i++){
            while(dq.isEmpty()==false && a[dq.peekLast()]<=a[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        //travesrsing through rest of the array
        for (int i=k;i<a.length;i++){
            //since the beginning of the dq always contains the largest element
            System.out.println(a[dq.peekFirst()]);
            //this part makes sure the current window gets processed,peek checks from the front(remove elements not part of current window)
            while (dq.isEmpty()== false && dq.peekFirst() <=i-k)
                dq.removeFirst();
            //remove the samllest element from dq
            while(dq.isEmpty()==false && a[dq.peekLast()]<=a[i])
                dq.removeLast();
            dq.addLast(i);
        }
        //print for last window
        System.out.println(a[dq.peekFirst()]);
    }
}
