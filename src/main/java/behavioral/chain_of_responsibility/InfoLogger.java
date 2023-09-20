package behavioral.chain_of_responsibility;

public class InfoLogger extends Logger{
    public InfoLogger(int level) {
        this.level = level;
        //setLogger(logger);
    }
    @Override
    public void write(String msg) {
        System.out.println("Infor Logger : " + msg);
    }
}
