package Presenter;


import Service.Service;
import View.View;

public class Presenter {
    private View view;
    private Service service;
    
public Presenter (View view) {
    this.view = view;
    service = new Service();
}

public void addToy(String name, int weight){
    service.addItem(name, weight);
    view.answer("The toy has been successfully added!");
}

public void changeWeight(long id, int weight){
    service.changeWeight(id, weight);
}

public String getToyListInfo(){
     return service.getToyInfo();
}

public void randGiveToy (String path){
service.randGiveToy(path);
}

}
