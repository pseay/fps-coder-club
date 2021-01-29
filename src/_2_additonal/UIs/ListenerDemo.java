package _2_additonal.UIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ListenerDemo {

    JFrame frame;

    ListenerDemo() {
        frame = new JFrame("Listener Demo");
        JButton button = new JButton("PANIC BUTTON");
        button.setBackground(Color.red);
        frame.add(button);

        //HERE IS THE LISTENER
        button.addActionListener((ActionEvent actionEvent) -> {
            button.setEnabled(false);//disables the button
            button.setBackground(new Button().getBackground());//set the background back to grey
            JOptionPane.showMessageDialog(null, "PANICKING PANICKING PANICKING!!!!!!!!!!!!!!!");
        });
    }

    void show() {
        //making the program stop when the window is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //making the frame (window) visible
        frame.setVisible(true);
        //setting the size
        frame.setSize(200, 200);
    }

    public static void main(String[] args) {
        new ListenerDemo().show();
    }
}
