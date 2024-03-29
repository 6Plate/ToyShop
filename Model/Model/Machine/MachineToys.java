package Model.Machine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import Model.File.FileHandler;
import Model.Toy.Toy;

public class MachineToys implements Iterable <Toy> {

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
for (int i = 0; i < listToys.size(); i++){
    countToys++;
}
return countToys;
}


public void randGiveToy(String path){
List<String> names = new ArrayList<>();
for (Toy toy: listToys){
    names.add(toy.getName());
}
String[] namesArray = new String[names.size()];
for (int i = 0; i < names.size(); i++) {
            namesArray[i] = names.get(i);
}
List <Integer> prob = new ArrayList<>();
for (Toy toy: listToys){
    prob.add(toy.getWeight());
}
int [] chance = prob.stream().mapToInt(i -> i).toArray();
int count = IntStream.of(chance).sum(); // ������� ���������� ��������� ������������� �������
Random random = new Random();
int index = random.nextInt(count);
    for (int i = 0; i < chance.length; i++) { // ���� �������, �������� ����������� ���� ������
            index -= chance[i];
            if(index < 0) {
            System.out.println(namesArray[i]);
            saveGive(namesArray[i], path);
            break;
              }
     }
}

public void saveGive(String name, String path){
FileHandler file = new FileHandler();
    for (Toy toy: listToys){
        if (toy.getName().equals(name)){
            file.save(toy.getInfo(), path);
        }
    }
}
@Override
 public String toString() {
     return getInfoToys();
}

public String getInfoToys(){
    StringBuilder sb = new StringBuilder();
    sb.append("All toys: ");
    for (Toy toy: listToys){
    sb.append("\n");
    sb.append(toy.getInfo());
    }
    return sb.toString();
}

@Override
public Iterator <Toy> iterator() {
    return new ToyIterator(listToys);
}


}


