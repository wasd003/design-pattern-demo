package command;

public class LightOnCommand implements ICommand{
    private Light light = new Light();
    @Override
    public void execute() {
        light.on();
    }
}
