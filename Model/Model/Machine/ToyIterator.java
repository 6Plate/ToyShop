package Model.Machine;
import java.util.Iterator;
import java.util.List;

import Model.Toy.Toy;

public class ToyIterator implements Iterator<Toy>  {
private int index;
private List<Toy> machine;
    
public ToyIterator (List<Toy> listToys){
        this.machine = listToys;
    }

@Override
public boolean hasNext() {
    return index < machine.size();
    }

@Override
public  Toy next() {
        return machine.get(index++);
    }
    

}
