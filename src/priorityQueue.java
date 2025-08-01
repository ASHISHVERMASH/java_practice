package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> Number = new PriorityQueue<>();
        Number.offer(456);
        Number.offer(4865);
        Number.offer(475);
        Number.offer(486);
        System.out.println(Number);


     }
}
