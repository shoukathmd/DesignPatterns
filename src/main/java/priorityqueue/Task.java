package priorityqueue;

public class Task implements Comparable<Task>{

    private String name;
    private int priority;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public Task(String name, Integer priority) {
        this.priority = priority;
        this.name = name;
    }

    public int compareTo(Task o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
