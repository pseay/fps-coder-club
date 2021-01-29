package _2_additonal.UIs;

import javax.swing.*;
import java.awt.*;

public class ListenerDemo2 {

    //all the variables that need to stay for the duration of the program
    JFrame frame;
    JPanel mainPanel;
    JButton red, green, blue;
    Color normal;


    ListenerDemo2() {
        //making all the components (buttons, panel, frame)
        initializeComponents();
        //making the button listeners
        initializeListeners();
    }

    void initializeListeners() {
        //each listener will reset the background for all of the buttons
        //then, it will set the background of the button that was clicked to a special color
        red.addActionListener(e -> {
            reset();
            red.setBackground(Color.red);
        });
        green.addActionListener(e -> {
            reset();
            green.setBackground(Color.green);
        });
        blue.addActionListener(e -> {
            reset();
            blue.setBackground(Color.blue);
        });
    }

    void reset() {
        //making all of their backgrounds the default
        red.setBackground(normal);
        green.setBackground(normal);
        blue.setBackground(normal);
    }

    void initializeComponents() {
        //initializing frame & panel
        frame = new JFrame("Listener Demo 2");
        mainPanel = new JPanel();

        //initializing buttons
        red = new JButton("red");
        green = new JButton("green");
        blue = new JButton("blue");

        //adding the children to the panel
        mainPanel.add(red);
        mainPanel.add(green);
        mainPanel.add(blue);

        //getting default background color of any button
        normal = new Button().getBackground();

        //adding the panel as a child to the frame (window)
        frame.add(mainPanel);
    }

    void show() {
        //making the program stop when the window is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //making the frame (window) visible
        frame.setVisible(true);
        //setting the size
        frame.setSize(green.getWidth() * 3 + 20, 100);
    }

    public static void main(String[] args) {
        //making all the components & listeners
        ListenerDemo2 listenerDemo2 = new ListenerDemo2();
        //showing it
        listenerDemo2.show();
    }
}
