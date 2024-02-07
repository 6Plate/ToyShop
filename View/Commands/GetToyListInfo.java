package View.Commands;

import View.View;

public class GetToyListInfo extends Command {
    private String discription;
     private View view;
   

    public GetToyListInfo(View view){
        super("Display a list of toys", view);
    }
    
    public void execute(){
    System.out.println(getView().getToyListInfo());
    }
}
