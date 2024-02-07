package View.Commands;

import View.View;

public abstract class Command {
    private String discription;
    private View view;

    public Command(String discription, View view){
        this.discription = discription;
        this.view = view;
    }

    public String getDiscription(){
        return discription;
    }
    
    public abstract void execute();

    View getView(){
        return view;
    }
}
