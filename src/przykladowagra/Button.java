/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przykladowagra;

import javax.swing.JButton;

/**
 *
 * @author Kaczy
 */
public class Button extends JButton {

    public String wartosc;
    int wiersz, kolumna;

    Button(int x, int y) {
        wartosc = "  ";
        wiersz = x;
        kolumna = y;
    }

    void klik(String war) {
        wartosc = war;
        this.setText(String.valueOf(war));
        this.setEnabled(false);
    }

}
