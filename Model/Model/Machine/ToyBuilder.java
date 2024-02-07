package Model.Machine;


import Model.Toy.Toy;

public class ToyBuilder {
    
    public Toy build (String name, int weight){
    Toy toy = new Toy(name, weight);
    return toy;
}

}
