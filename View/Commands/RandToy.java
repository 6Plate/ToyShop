package View.Commands;

import View.View;

public class RandToy extends Command {
    private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public RandToy(View view){
        super("Добавить человека", view);
    }
    
    public void execute(){
    getView().randGiveToy();
    }
}