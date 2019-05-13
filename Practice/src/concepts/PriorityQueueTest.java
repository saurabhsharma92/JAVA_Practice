package concepts;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<int []> queue = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
		queue.add(new int[]{1, 2});
		queue.add(new int[]{5, 7});
		queue.add(new int[]{4, 9});
		queue.add(new int[]{7, 2});
		queue.add(new int[]{8, 2});
		
		System.out.println(queue.toString());
		while(!queue.isEmpty())
			System.out.println(queue.remove()[0]);
	}

}
