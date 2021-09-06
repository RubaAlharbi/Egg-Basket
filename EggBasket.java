import java.util.Scanner;
public class EggBasket {
public static void main(String[] args) {
int numberOfBaskets, eggsPerBasket;
int totalEggs;
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the number of eggs in each baskets:");
eggsPerBasket = keyboard.nextInt();
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the number of baskets:");
numberOfBaskets = keyboard.nextInt();
totalEggs = numberOfBaskets * eggsPerBasket;
System.out.println("If you have");
System.out.println(eggsPerBasket +" eggs per basket and" + numberOfBaskets);
System.out.println("Now we take two eggs out of each basket.");
eggsPerBasket = eggsPerBasket - 2;
totalEggs = numberOfBaskets * eggsPerBasket;
System.out.println("You now have");
System.out.println(eggsPerBasket + " eggs per basket and");
System.out.println(numberOfBaskets + " baskets.");
System.out.println("The new total number of eggs is " + totalEggs);
} // main
} // EggBasket