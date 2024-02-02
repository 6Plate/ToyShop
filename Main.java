import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
 public static void main(String[] args) {
// Toy toy1 = new Toy("Bear", 10);
// Toy toy2 = new Toy("Chicken", 2);
// Toy toy3 = new Toy("Fox", 6);
// System.out.println(toy1);
// System.out.println(toy2);
// System.out.println(toy3);
// MachineToys automat = new MachineToys();
// automat.addToys(toy1);
// automat.addToys(toy2);
// automat.addToys(toy3);
// automat.randGiveToy();


        String [] name = new String [] {"Bear", "Bunny",  "Dragon", "Fox", "Tiger", "Robot"}; // �����
        int[] chance = new int[] {350, 200, 2000, 250, 300, 270}; // ����������
        
        int count = IntStream.of(chance).sum(); // ������� ���������� ��������� ������������� �������

        // ����� ������������:
        for (int i = 0; i < chance.length; i++) {
            System.out.println("Prob number \"" + name[i] + "\":  \t" + (chance[i]*100d/count) + "%");
        }
        // ��������� ���������� �����
        Random random = new Random();
        for (int randomNumsCount = 0; randomNumsCount < 10; randomNumsCount++) {
            int index = random.nextInt(count); // �������� ��������� ������ �� ������������� �������
            for (int i = 0; i < chance.length; i++) { // ���� �������, �������� ����������� ���� ������
                index -= chance[i];
                if(index < 0) {
                    System.out.println("Random number: " + name[i]);
                    break;
                }
            }

        }
    }
}

