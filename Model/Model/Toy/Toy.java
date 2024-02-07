package Model.Toy;
import java.io.Serializable;


public class Toy implements Serializable {
    
    private long id;
    private String name;
    private int weight;

    
    public Toy (String name, int weight){
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
    
    @Override
    public String toString(){
        return getInfo();
    }
    
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(" ");
        sb.append("name: ");
        sb.append(name);
        sb.append(" ");
        sb.append("weight: ");
        sb.append(getWeight());
        return sb.toString();
    }

}
