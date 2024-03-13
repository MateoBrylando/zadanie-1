// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    String tekst = "Hello World";
    for (int i = 0; i < tekst.length(); i++) {
        for(int j = 0; j < i ; j++){
          System.out.print(" ");
        }
        System.out.println(tekst.charAt(i));
        
      
    }
  }
}