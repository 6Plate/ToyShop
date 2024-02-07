package View.Commands;

import View.View;

public class ChangeWeight extends Command {
    private String discription;
     private View view;
    


    public ChangeWeight (View view){
        super("Change weight of toy", view);
    }
    
    public void execute(){
    getView().changeWeight();
    }
    
}
