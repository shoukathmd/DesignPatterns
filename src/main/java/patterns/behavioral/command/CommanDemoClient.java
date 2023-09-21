package patterns.behavioral.command;

public class CommanDemoClient {


    public static void main(String... args) {
        Light light = new Light();
        Command lightTurnOn = new LightTurnOnCommand(light);
        Command lightTurnOf = new LightTurnOffCommand(light);

        lightTurnOf.execute();
        lightTurnOn.execute();
    }
}
