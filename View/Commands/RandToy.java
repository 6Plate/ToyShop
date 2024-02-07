package View.Commands;

import View.View;

public class RandToy extends Command {
    private String discription;
     private View view;
    

    public RandToy(View view){
        super("Toy raffle", view);
    }
    
    public void execute(){
    getView().randGiveToy();
    }
}
