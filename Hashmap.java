/**
 * Hashmap
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {


public static void main(String[] args) {
HashMap<String, String> cars = new HashMap<String, String>();  {


    
 cars.put("Toyota ", "Camry ");
 cars.put("Honda ", " Civic");
 cars.put("Ford ","Fusion");
 cars.put("Mercedez ", "S class");
 cars.put("GMC ", " Cadillac");


//System.out.println(cars);
 
 Scanner scanner = new Scanner(System.in);
 System.out.println("What model of car are you looking for?");

 String carsModel = scanner.nextLine();
 
 if (cars.containsKey(carsModel)) {
    
    cars.put(carsModel, "Honda");
  
    System.out.println("Yes we have the car you want");
 
      }else{
    System.out.println("Sorry, come back next week");
 }
     
 
}
}}