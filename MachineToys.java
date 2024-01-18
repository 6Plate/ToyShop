import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MachineToys {

public List<Toy> listToys;
public long toysId;

public MachineToys(){
    listToys = new ArrayList<>();
}

public long getToysId() {
    return this.toysId;
}

public void setToysId(long toysId) {
    this.toysId = toysId;
}

public void addToys(Toy toy){
    if(!listToys.contains(toy)){
        listToys.add(toy);
        toy.setId(toysId++);
    }
}

public Toy getById(long id){
    for (Toy toy: listToys){
    if (toy.getId() == id){
        return toy;
    }
    }
    return null;
    }

public List<Toy> getByName(String name){
    List<Toy> names = new ArrayList<>();
    for(Toy toy:listToys){
    if(toy.getName().equals(name)){
        names.add(toy);
        }
    }
    return names;
}

public void changeWeight(long id, int weight){
getById(id).setWeight(weight);
}

public int getCountToys(){
int countToys = 0;
for (Toy toy: listToys){
countToys++;
}
return countToys;
}


public Toy randGiveToy(){
    List <Double> prob = new ArrayList<>();
    for (Toy toy:listToys){
    prob.add(createDouble(toy.getWeight()));
    }
Random rand = new Random();
Double number = rand.nextDouble();
int index = 0;
for (int i = 0; i < prob.size(); i++)
{
if (number <= prob.get(i))
{
index = i;
break;
}
else{
prob.get(i+1) += prob.get(i);

}
}
}

public Double createDouble(int i){
double r = i;
double f = r / 100; 
return f;
}




    
}