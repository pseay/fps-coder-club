package _2_additonal.UIs;

import javax.swing.*;

public class YesNoMaybeSo {
    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog("Is chocolate better than vanilla?");
        if (response.toLowerCase().equals("yes")) {
            JOptionPane.showMessageDialog(null, "You know the truth.");
        } else if (response.toLowerCase().equals("no")) {
            JOptionPane.showMessageDialog(null, "WRONG! Chocolate is better!");
        }
    }
}
