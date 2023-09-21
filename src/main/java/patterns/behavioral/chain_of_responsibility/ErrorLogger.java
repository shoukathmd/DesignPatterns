package patterns.behavioral.chain_of_responsibility;

public class ErrorLogger extends Logger{
    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    public void write(String msg) {
        System.out.println("Error Logger : " + msg);
    }
}
