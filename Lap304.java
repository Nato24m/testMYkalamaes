import javax.swing.*;
import java.text.DecimalFormat;
import java.text.Format;

public class Lap304 {
    static void main() {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.):"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));
        double bmi = weight / ((height / 100)*(height / 100));
        DecimalFormat frm = new DecimalFormat("##.00");
        if (bmi <= 18.5)
        {
            JOptionPane.showMessageDialog(null,"Your BMI is "+ frm.format(bmi) +"\nBMI result is Underweight");
        }
        else if (bmi <= 24.9)
        {
            JOptionPane.showMessageDialog(null,"Your BMI is "+ frm.format(bmi) +"\nBMI result is Healthy Weight");
        }
        else if (bmi <= 29.9)
        {
            JOptionPane.showMessageDialog(null,"Your BMI is "+ frm.format(bmi) +"\nBMI result is Overweight");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Your BMI is "+ frm.format(bmi) +"\nBMI result is Obese");
        }
    }
}
