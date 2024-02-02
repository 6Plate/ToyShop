public class ToysException extends Exception  {
    
public ToysException (){

}

public void NotCorrectWeigt(int i){
    System.out.println("Exception: ToysException");
    System.out.printf("It`s not correct weight: %s", i);
    System.out.println();
}

}
