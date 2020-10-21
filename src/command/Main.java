package command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICommand> commands = new ArrayList<>();
        for(int i = 0; i < 5; i++) commands.add(new LightOnCommand());
        for(int i = 0; i < 5; i++) commands.add(new StereoOnCommand());
        for(ICommand cmd : commands)
            cmd.execute();
    }
}
