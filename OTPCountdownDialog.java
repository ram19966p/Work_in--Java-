/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tastassiment;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OTPCountdownDialog extends JDialog {

    private JLabel otpLabel;
    private JLabel timerLabel;
    private int timeLeft = 300; // 300 seconds = 5 minutes
    private Timer timer;

    public OTPCountdownDialog(JFrame parent) {
        super(parent, "OTP Verification", true);

        // Dialog settings
        setSize(350, 200);
        setLayout(new GridLayout(3, 1));
        setLocationRelativeTo(parent);

        // OTP Label
        otpLabel = new JLabel("Your OTP is: 123456", SwingConstants.CENTER);
        otpLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(otpLabel);

        // Timer Label
        timerLabel = new JLabel("", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        add(timerLabel);

        // Button to simulate OTP Resend
        JButton resendButton = new JButton("Resend OTP");
        resendButton.addActionListener(e -> resendOTP());
        add(resendButton);

        // Start the countdown timer
        startTimer();
    }

    // Method to start the countdown timer
    private void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timeLeft > 0) {
                    timeLeft--;
                    updateTimerLabel();
                } else {
                    timer.stop();
                    JOptionPane.showMessageDialog(OTPCountdownDialog.this, 
                                                  "OTP has expired! Please request a new OTP.",
                                                  "OTP Expired", 
                                                  JOptionPane.WARNING_MESSAGE);
                    dispose(); // Close the dialog when OTP expires
                }
            }
        });
        timer.start();
    }

    // Method to update the timer label
    private void updateTimerLabel() {
        int minutes = timeLeft / 60;
        int seconds = timeLeft % 60;
        timerLabel.setText(String.format("Time left: %02d:%02d", minutes, seconds));
    }

    // Method to reset the OTP and timer
    private void resendOTP() {
        timeLeft = 300; // reset to 5 minutes
        otpLabel.setText("Your OTP is: " + generateNewOTP()); // generate a new OTP
        if (!timer.isRunning()) {
            startTimer();
        }
    }

    // Method to generate a new OTP (dummy OTP for demonstration)
    private String generateNewOTP() {
        return String.valueOf((int) (Math.random() * 900000) + 100000); // 6-digit OTP
    }

    public static void main(String[] args) {
        // Create the parent frame
        JFrame parentFrame = new JFrame();
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(400, 200);
        parentFrame.setVisible(true);

        // Open OTP Dialog
        OTPCountdownDialog otpDialog = new OTPCountdownDialog(parentFrame);
        otpDialog.setVisible(true);
    }
}
