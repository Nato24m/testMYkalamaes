import javax.swing.*;

public class Lap302 {
    static void main() {
        String name = JOptionPane.showInputDialog("Enter your name:");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.):"));
        int gender_male = JOptionPane.showConfirmDialog(null,"Are you biological is Male?","Gender",JOptionPane.YES_NO_OPTION);
        if (gender_male == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Hello,Mr."+name+"\nIf your height is "+height+" cm.\nYour weight should be "+(height-100)+" kg.");
        }
        else
        {
            int gender_female = JOptionPane.showConfirmDialog(null,"Are you biological is Female?","Gender",JOptionPane.YES_NO_OPTION);
            if (gender_female == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Hello,Ms."+name+"\nIf your height is "+height+" cm.\nYour weight should be "+(height-110)+" kg.");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You can use BMI to message your weight and height.");
            }
        }

    }
}
