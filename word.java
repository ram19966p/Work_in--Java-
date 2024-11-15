
package com.mycompany.tastassiment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.Timer;


public class word {
    private Timer timer;
    private String originalText;
    private int currentPos = 0;
    
    
    public void runword( JTextField tff1){
          originalText = tff1.getText();

       
        timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scrollText(tff1);
            }
        });
        timer.start();
    }
      private void scrollText(JTextField tff1) {
        if (originalText.length() > 0) {
            String scrollingText = originalText.substring(currentPos) + originalText.substring(0, currentPos);
            tff1.setText(scrollingText);
            currentPos++;
            
            
            if (currentPos >= originalText.length()) {
                currentPos = 0;
            }
        }
    }

    
    }
    

