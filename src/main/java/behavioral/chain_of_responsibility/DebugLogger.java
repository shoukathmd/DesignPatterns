package behavioral.chain_of_responsibility;

public class DebugLogger extends Logger{
    public DebugLogger(int level) {
        this.level = level;
    }
    public void write(String msg) {
        System.out.println("Debug Logger : " + msg);
    }
}
