import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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




    
}