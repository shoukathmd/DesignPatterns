package composite;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Directory implements FileSystemEntity{
    String name;
    int size;
    List<FileSystemEntity> list;

    public Directory(int size, List<FileSystemEntity> list, String name) {
        this.size = size;
        this.list = list;
        this.name = name;
    }

    @Override
    public void display() {
        list.stream().forEach(item -> item.display());
        System.out.println(" Directory : " + name);
    }

    @Override
    public int getSize() {
        AtomicInteger result = new AtomicInteger();
        list.stream().forEach(item -> result.addAndGet(item.getSize()));
        return result.addAndGet(10);
    }

    @Override
    public void delete() {
        list.stream().forEach(item -> item.delete());
        System.out.println("Deleting Directory : " + name);
    }
}
