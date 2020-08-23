public class CircularTour {
    public static void main(String[] args) {
        int[] pet={50,10,60,100};
        int[] dis={30,20,100,10};
        System.out.println(path(pet,dis));
    }
    /*
    problem is given petrol pum distance and quantity of petrol at each pum we need to find a start pt from where we can visit all the pump and come back
    idea is when the petrol becomes negative that means that cant be the start pt and we need to consider the point after -ve as start pt
  */

    public static int path(int[] cap,int[] dist){
        int start=0,curr=0,prev=0;
        for(int i=0;i<cap.length;i++){
            curr+=(cap[i]-dist[i]);
            if(curr<0){
                start=i+1;
                prev+=curr;
                curr=0;
            }
        }
        //becuase its a cycle and from last node we have to reach to start node
        return ((curr+prev)>=0)?(start+1):-1;
    }
}
