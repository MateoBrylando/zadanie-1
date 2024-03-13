

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    int suma = 0;
    
   Random rand = new Random(); 
      for(int i = 0; i<5; i++){

         int randomNum = rand.nextInt(101);
         System.out.println(randomNum);
        int iloczyn = randomNum * randomNum;
        System.out.println("Iloraz tej liczby to : " + iloczyn);
        suma += iloczyn;

        
      }
      System.out.println("Suma wszystkich ilorazów to : " + suma);
          
        }
      
    }
  
