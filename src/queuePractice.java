package collectionFramework;
import java.util.LinkedList;
import java.util.Queue;

public class queuePractice {
    public static void main(String[] args) {
        Queue<Integer>  employeeId = new LinkedList<>();
        //add
        employeeId.add(58);
        employeeId.add(78);
        employeeId.add(458);
        employeeId.add(4587);
        employeeId.add(2);
        System.out.println(employeeId);

        //offer
        employeeId.offer(458);
        employeeId.offer(586);
        employeeId.offer(458);
        employeeId.offer(789);
        System.out.println(employeeId);

        //remove
        employeeId.remove();
        System.out.println(employeeId);

        //poll(remove)
        employeeId.poll();
        System.out.println(employeeId);

        //peek
        System.out.println(employeeId.peek());

        //element
        System.out.println(employeeId.element());
    }
}
