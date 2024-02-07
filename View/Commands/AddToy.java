package View.Commands;

import View.View;

public class AddToy extends Command {
     private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public AddToy(View view){
        super("Add toy", view);
    }
    
    public void execute(){
    getView().addToy();
    }
}
