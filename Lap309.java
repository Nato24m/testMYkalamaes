import javax.swing.*;

public class Lap309 {
    static void main() {
        int chicken = 99;
        int pork = 89;
        int beef = 109;
        int total = 0;
        int menu = JOptionPane.showConfirmDialog(null,"Do you want to order menu?","Yakitori Shop",JOptionPane.YES_NO_OPTION);
        while (true)
        {
            if (menu == JOptionPane.NO_OPTION)
            {
                break;
            }
            else
            {
                int menu_choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Yakitori Menu\n[1]Chicken Wing 99 B.\n" +
                        "[2]Pork with Leek 89 B.\n[3]Beef tongue 109 B.\n[0]Exit and Calculate\nEnter menu number:"));
                if ( menu_choice == 1)
                {
                    total += chicken;
                }
                else if ( menu_choice == 2)
                {
                    total += pork;
                }
                else if ( menu_choice == 3)
                {
                    total += beef;
                }
                else if ( menu_choice == 0)
                {
                    JOptionPane.showMessageDialog(null,"Total price is "+total+" Baht.");
                    total = 0;
                }
                else
                {
                   continue;
                }
            }
        }
    }
}
