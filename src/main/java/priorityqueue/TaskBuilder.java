package priorityqueue;

public class TaskBuilder {

    private String name;
    private int priority;


    public TaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TaskBuilder setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public Task build() {
        return new Task(this.name, this.priority);
    }
}
