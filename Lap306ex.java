import javax.swing.*;

public class Lap306ex {
    static void main() {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an integer number:"));
        int sum = 0;
        for (int i = 1;i <= number;i++)
        {
            sum += i;
        }
        JOptionPane.showMessageDialog(null,"Summation of 1 to "+number+" is "+sum);
    }
}
