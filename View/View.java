package View;


public interface View {
    void start();
    void answer(String answer);
    void addToy();
    String getToyListInfo();
    void randGiveToy(String path);
    void changeWeight(int id, int weight);
    void finish();
    }
