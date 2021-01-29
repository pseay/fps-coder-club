package additonal.UIs;

import javax.swing.*;

public class FormDemo {

    //all the variables that need to stay (or be referenced) for the duration of the program
    JFrame frame;
    JPanel mainPanel;

    JPanel panel1, panel2;
    JTextField field1, field2;
    JButton submitButton;

    FormDemo() {
        initializeComponents();
    }

    void initializeComponents() {
        //makes the window and the main frame
        frame = new JFrame("Form Demo");
        mainPanel = new JPanel();

        //makes the first line of components (label + input inside a panel)
        panel1 = new JPanel();
        panel1.add(new JLabel("Username:"));
        field1 = new JTextField(20);
        panel1.add(field1);

        //makes the second line of components (label + input inside a panel)
        panel2 = new JPanel();
        panel2.add(new JLabel("Password:"));
        field2 = new JTextField(20);
        panel2.add(field2);

        //makes the button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Your username is '" + field1.getText() + "' and your password is '" + field2.getText() + "'."));

        //adds the panels to the main's children + adds main panel to the frame's children
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(submitButton);
        frame.add(mainPanel);
    }

    void show() {
        //making the program stop when the window is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //making the frame (window) visible
        frame.setVisible(true);
        //setting the size
        frame.setSize(panel1.getWidth() + 30, 200);
    }

    public static void main(String[] args) {
        FormDemo formDemo = new FormDemo();
        formDemo.show();
    }
}
