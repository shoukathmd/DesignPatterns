package priorityqueue;

import java.util.*;

public class PriorityQueueDemoClient {

    public static void main(String... args) {

        Task t1 = new TaskBuilder().setName("Task-1").setPriority(4).build();
        Task t2 = new TaskBuilder().setName("Task-2").setPriority(1).build();
        Task t3 = new TaskBuilder().setName("Task-3").setPriority(2).build();
        Task t4 = new TaskBuilder().setName("Task-4").setPriority(3).build();

        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

       // priorityQueue.addAll(Arrays.asList(t1, t2, t3, t4));
        priorityQueue.add(t1);
        priorityQueue.add(t2);
        priorityQueue.add(t3);
        priorityQueue.add(t4);


        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll());
        }

//        Comparator<Task> comparator = new Comparator<Task>() {
//            @Override
//            public int compare(Task o1, Task o2) {
//                return Integer.compare(o1.getPriority(), o2.getPriority());
//            }
//        };

        Comparator<Task> comparator = Comparator.comparing(Task::getPriority);
        PriorityQueue<Task> priorityQueue_1 = new PriorityQueue<>(comparator);

        priorityQueue_1.add(t1);
        priorityQueue_1.add(t2);
        priorityQueue_1.add(t3);
        priorityQueue_1.add(t4);
        Deque<Integer> dequeu = new ArrayDeque<>();
        while (priorityQueue_1.size() > 0) {
            System.out.println(priorityQueue_1.poll());
        }
    }
}
