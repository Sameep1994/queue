import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class StackUsingQueue {
    public static Queue<Integer> mq = new Queue<Integer>() {
        public boolean add(Integer integer) {
            return false;
        }

        public boolean offer(Integer integer) {
            return false;
        }

        public Integer remove() {
            return null;
        }

        public Integer poll() {
            return null;
        }

        public Integer element() {
            return null;
        }

        public Integer peek() {
            return null;
        }

        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean contains(Object o) {
            return false;
        }

        public Iterator<Integer> iterator() {
            return null;
        }

        public Object[] toArray() {
            return new Object[0];
        }

        public <T> T[] toArray(T[] a) {
            return null;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection<?> c) {
            return false;
        }

        public boolean addAll(Collection<? extends Integer> c) {
            return false;
        }

        public boolean removeAll(Collection<?> c) {
            return false;
        }

        public boolean retainAll(Collection<?> c) {
            return false;
        }

        public void clear() {

        }
    };
    public static Queue<Integer> aq = new Queue<Integer>() {
        public boolean add(Integer integer) {
            return false;
        }

        public boolean offer(Integer integer) {
            return false;
        }

        public Integer remove() {
            return null;
        }

        public Integer poll() {
            return null;
        }

        public Integer element() {
            return null;
        }

        public Integer peek() {
            return null;
        }

        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean contains(Object o) {
            return false;
        }

        public Iterator<Integer> iterator() {
            return null;
        }

        public Object[] toArray() {
            return new Object[0];
        }

        public <T> T[] toArray(T[] a) {
            return null;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection<?> c) {
            return false;
        }

        public boolean addAll(Collection<? extends Integer> c) {
            return false;
        }

        public boolean removeAll(Collection<?> c) {
            return false;
        }

        public boolean retainAll(Collection<?> c) {
            return false;
        }

        public void clear() {

        }
    };
    public static void main(String[] args) {

    }
//we are using two stacks and whenever there is a enqueue request we move exisiting elements to auxilary queue enqueue the val to orignal queueu
//move back value from aux to main queue
    public static int pop(){
        if(mq.isEmpty()){
            return -1;
        }
        return mq.poll();
    }

    public static void push(int x){
        while (mq.isEmpty()==false){
            aq.add(mq.poll());
        }
        mq.add(x);
        while (aq.isEmpty()==false){
            mq.add(aq.poll());
        }
    }
}
