package command;

public class StereoOnCommand implements ICommand{
    private Stereo stereo = new Stereo();
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }
}
