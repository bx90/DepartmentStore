package otherTests;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQueueDemo {

	private static Comparator<Integer> IntegerComparator = new Comparator<Integer>() {
        public int compare(Integer left , Integer right) {
            return left - right;
        }
    };
    
	public static void main(String[] args) {
		 Queue<Integer> integerPq = new PriorityQueue<Integer>(10 , IntegerComparator);
		 integerPq.offer(10);
		 integerPq.offer(8);
		 System.out.println(integerPq.peek());
	}

}
