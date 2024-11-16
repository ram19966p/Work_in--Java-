
package com.mycompany.studentmanegment;


import java.awt.*;
import javax.swing.*;

public class BackgroundImageFrame extends JFrame {
    public BackgroundImageFrame() {
     
        ImageIcon backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("1693539116665.jpg"));

        if (backgroundImage.getImage() == null) {
            System.err.println("Error: Background image not found!");
        }

        
       
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage.getImage() != null) {
                    g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        backgroundPanel.setLayout(null); // Use null layout to position components manually

        // Create and add labels and text boxes
        JLabel label = new JLabel("Label");
        label.setBounds(50, 50, 100, 30); // Position and size of the label
        JTextField textField = new JTextField("TextBox");
        textField.setBounds(50, 100, 200, 30); // Position and size of the text box

        backgroundPanel.add(label);
        backgroundPanel.add(textField);

        // Add the background panel to the frame
        add(backgroundPanel);

        // Frame settings
        setTitle("Background Image Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BackgroundImageFrame().setVisible(true);
        });
    }
    
    
    
    
    
}
 