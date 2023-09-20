package behavioral.command;

public class LightTurnOnCommand implements Command{

    private Light light;

    public LightTurnOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
