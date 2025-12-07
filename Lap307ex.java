import javax.swing.*;

public class Lap307ex {
    static void main() {
        double total = 0;
        while (true)
        {
            double price = Double.parseDouble(JOptionPane.showInputDialog(null,"Input price [press 0 to stop]"));
            if ( price < 0)
            {
                price = Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid price!!\nInput price [press 0 to stop]"));
            }
            else if ( price == 0)
            {
                break;
            }
            total += price;
        }
        JOptionPane.showMessageDialog(null,"Total price is "+total+ " baht.");
    }
}
