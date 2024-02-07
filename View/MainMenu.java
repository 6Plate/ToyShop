package View;

import java.util.ArrayList;
import java.util.List;

import View.Commands.AddToy;
import View.Commands.ChangeWeight;
import View.Commands.Command;
import View.Commands.Finish;
import View.Commands.GetToyListInfo;
import View.Commands.RandToy;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(View view){
        commandList = new ArrayList<>();
        commandList.add(new AddToy(view));
        commandList.add(new GetToyListInfo(view));
        commandList.add(new ChangeWeight(view));
        commandList.add(new RandToy(view));
        commandList.add(new Finish(view));
}

public String print(){
    StringBuilder stringBuilder= new StringBuilder();
    stringBuilder.append("Список команд: \n");
    for(int i = 0; i < commandList.size(); i++){
        stringBuilder.append(i+1);
        stringBuilder.append(".");
        stringBuilder.append(commandList.get(i).getDiscription());
        stringBuilder.append("\n");
    }
    return stringBuilder.toString();
}
    public void execute(int choise){
        Command command = commandList.get(choise -1);
        command.execute();

    }
    public int size(){
        return commandList.size();
    }
    
}
