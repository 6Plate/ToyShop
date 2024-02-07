package View.Commands;

import View.View;

public class Finish extends Command {
    private String discription;
    private View view;
   // поле выбора меню: "1 - Добавить имя"


   public Finish(View view){
       super("Закончить работу", view);
   }
   
   public void execute(){
   getView().finish();
   }
}
