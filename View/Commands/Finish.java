package View.Commands;

import View.View;

public class Finish extends Command {
   
    private String discription;
    private View view;
   

   public Finish(View view){
       super("Finish programm", view);
   }
   
   public void execute(){
   getView().finish();
   }
}
