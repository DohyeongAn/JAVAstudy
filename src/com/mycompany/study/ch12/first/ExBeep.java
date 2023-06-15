package com.mycompany.study.ch12.first;

import java.awt.Toolkit;
                                                           
public class ExBeep {
    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            Thread.sleep(500);
        }

    }
    
}
