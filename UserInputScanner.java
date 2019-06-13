import java.util.Scanner;

public class UserInputScanner{ 
 Public static void main(String[] args){
   Scanner kin = new Scanner(System.in);
 
   System.out.print("What is your name?");
   String name = kin.nextLine();
   Scanner kin1 = new Scanner(System.in);

   System.out.print("What is your Street Address?");
   String address = kin.nextLine();
   Scanner kin2 = new Scanner(System.in);

   System.out.print("What is your city?");
   String city = kin2.nextLine();
   Scanner kin3 = new Scanner(System.in);
   
   System.out.print("What is your state?");
   String state = kin3.nextLine();
   Scanner kin4 = new Scanner(System.in);
    
   System.out.print("What is your zip code?"
   String zip = kin4.nextLine();

   System.out.println("Hello" + name + ",it's nice to meet you!";
   System.out.println(address);
   System.out.println(city +"," + state + " " + zip);


  }
}
