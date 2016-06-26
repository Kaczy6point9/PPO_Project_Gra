/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przykladowagra;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaczy
 */
public class Przykladowagra extends JFrame implements ActionListener {

    final static int wiersze = 3;
    final static int kolumny = 3;
    final static int wygrana = 3;
    int tura = 0;
    int score = 0;

    public static void main(String[] args) {
        Przykladowagra okno = new Przykladowagra();
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
        okno.setLayout(new GridLayout(wiersze, kolumny));
        okno.setSize(500, 500);
        okno.setVisible(true);
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                Button przycisk = new Button(i, j);
                przycisk.addActionListener(okno);
                okno.add(przycisk);
            }
        }
    }
    JFrame okno_wygrana;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (tura % 2 == 0) {
            ((Button) e.getSource()).klik("O");
            tura++;
          
        } else {
            ((Button) e.getSource()).klik("X");
            tura++;
        }
         
        for(int i = 0; i < wiersze; ++i)
            {
                for(int j = 0; j < kolumny; j++)
                {
                    if(true)
                    {
                        score++;
                    }
                }
            }
            if(score == wygrana)
            {
                JOptionPane.showMessageDialog(okno_wygrana, "Wygralo gracz O");
            }

    }
}
