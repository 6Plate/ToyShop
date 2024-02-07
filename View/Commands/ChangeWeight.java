package View.Commands;

import View.View;

public class ChangeWeight extends Command {
    private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public ChangeWeight (View view){
        super("Добавить человека", view);
    }
    
    public void execute(){
    getView().changeWeight();
    }
    
}
