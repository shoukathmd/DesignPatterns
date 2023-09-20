package structural.composite;

public class File implements FileSystemEntity{

    String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("Name : " + name);
    }

    @Override
    public int getSize() {
        return 10;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file from the file system :"  + name);
    }
}
