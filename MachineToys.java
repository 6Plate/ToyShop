import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
for (int i = 0; i < listToys.size(); i++){
    countToys++;
}
return countToys;
}


public void randGiveToy(){
List<String> names = Arrays.asList();
String[] nameArray = names.toArray(new String[0]);
List <Integer> prob = new ArrayList<>();
for (Toy toy: listToys){
    prob.add(toy.getWeight());
}

Random rand = new Random();
Double number = rand.nextDouble();
int Index = 0;
for (int i = 0; i < arr.length; i++)
{
if (number <= arr[i])
{
Index = i; 
break;
}
arr[i + 1] += arr[i];
}
System.out.println(nameArray.toString());
System.out.println(Index);
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

}

// public Toy checkList (int index){
// for(Toy toy:listToys){
// if (toy.getWeight() == index){
//     return toy;
// }
// }
// } 



