public class Toy {
    
    private long id;
    private String name;
    private int weight;

    
    public Toy(String name, int weight){
    id = -1;
    this.name = name;
    this.weight = weight;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    
}