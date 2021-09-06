// a progarm to show input/output operations using dialog boxes
 // source: Savitch (2009)
 import javax.swing.JOptionPane;
 public class EggBasket2 {
   public static void main(String[] args) {
    int numberOfBaskets, eggsPerBasket, totalEggs;
    String input;
    input=JOptionPane.showInputDialog( "Enter the number of eggs in each basket:" );
    eggsPerBasket=Integer.parseInt(input);
    input=JOptionPane.showInputDialog ("Enter the number of baskets" );
    numberOfBaskets=Integer.parseInt(input);
    totalEggs=numberOfBaskets * eggsPerBasket;
    JOptionPane.showMessageDialog(null, "If you hava\n"  + eggsPerBasket +
                     " eggs per basket and\n"  + numberOfBaskets + 
                   " baskets, then\n the total number of eggs is " + totalEggs); 
    JOptionPane.showMessageDialog (null,"Now we take tow eggs out of each basket.");
    eggsPerBasket=eggsPerBasket - 2;
    totalEggs=numberOfBaskets * eggsPerBasket;
    JOptionPane.showMessageDialog(null," You now hava " + eggsPerBasket
                       + " eggs per basket and\n" + numberOfBaskets
                       + " baskets.\nThe new total number of eggs is"
                       + totalEggs);
     } // main
  } // EggBasket2