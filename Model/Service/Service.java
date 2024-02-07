package Service;


import Model.Machine.MachineToys;
import Model.Machine.ToyBuilder;
import Model.Toy.Toy;

public class Service {
    private MachineToys machine;
    private ToyBuilder builder;
     
    public Service(){
        machine = new MachineToys();
        builder = new ToyBuilder();
    }

     public void addItem(String name, int weight){
        Toy toy = builder.build(name, weight);
        machine.addToys(toy);
    }

    public void randGiveToy (String path) {
        machine.randGiveToy(path);
    }

    public void changeWeight(long id, int weight){
        machine.changeWeight(id, weight);
    }
    
    public String getToyInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Дерево:");
        for (Toy toy: machine){
        sb.append("\n");
        sb.append(toy);
            }
        return sb.toString();
        }



}