package View;

import java.util.Scanner;

import Presenter.Presenter;



public class ConsoleUI implements View{
private Scanner scanner;
private Presenter presenter;
private boolean work;
private MainMenu menu;

public ConsoleUI(){
    scanner = new Scanner(System.in);
    presenter = new Presenter(this);
    work = true;
    menu = new MainMenu(this);
    }
    
    @Override
    public void start() {
    System.out.println("List of commands: ");
    while (work) {
    printMenu();
    scanMenu();
    }
}
    private void scanMenu(){
        String choiseStr = scanner.nextLine();
        int choise = Integer.parseInt(choiseStr);
        menu.execute(choise);
        
        }
    public void addToy(){
        System.out.println("Indicate the name of the toy: ");
        String name = scanner.nextLine();
        System.out.println("indicate the weight of the toy:");
        String weightStr = scanner.nextLine();
        int weight = Integer.parseInt(weightStr);
        presenter.addToy(name, weight);
    }

    public String getToyListInfo(){
       return presenter.getToyListInfo();
    }
    public void randGiveToy(){
        System.out.println("Enter the path to the file to save the result: ");
        String path = scanner.nextLine();
        presenter.randGiveToy(path);
    }
    
    public void changeWeight(){
        System.out.println("Enter the ID of the toy for which you want to change the weight: ");
        String idStr = scanner.nextLine();
        int id = Integer.parseInt(idStr);
        System.out.println("Enter your desired weight: ");
        String weightStr = scanner.nextLine();
        int weight = Integer.parseInt(weightStr);
        presenter.changeWeight(id, weight);
    }

    public void finish(){
        System.out.println("See you soon!");
        work = false;
    }

    public void error(){
        System.out.println("Something went wrong");
    }
    
    private void printMenu(){
    System.out.println(menu.print());
    }

    @Override
    public void answer(String answer) {System.out.println(answer);}

    @Override
    public String toString() {return getToyListInfo();}
}

