import javax.swing.*;

public class Lap307 {
    static void main() {
        double total = 0;
        while (true)
        {
            double price = Double.parseDouble(JOptionPane.showInputDialog(null,"In put price[press 0 to stop];"));
            if ( price < 0 )
            {
                price = Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid price!!\nIn put price[press 0 to stop];"));
            }
            if (price < 0)
            {
                continue;
            }
            if ( price == 0)
            {
                break;
            }
            total += price;
        }
        JOptionPane.showMessageDialog(null,"Total price is "+total+" baht.");
    }
}
