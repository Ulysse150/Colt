package Colt;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

class Ecoute extends MouseAdapter {
    JPanel panneau;

    Ecoute(JPanel panneau) {
        this.panneau = panneau;
    }

    public void mouseEntered(MouseEvent e) {
        panneau.setBackground(Color.GREEN);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        panneau.setBackground(Color.YELLOW);
    }

    public void mouseExited(MouseEvent e) {
        panneau.setBackground(Color.RED);
    }
}

public class EntenduBis extends JPanel {
    public EntenduBis() {
        setPreferredSize(new Dimension(200, 200));
        addMouseListener(new Ecoute(this));
        setBackground(Color.RED);
    }
}

class EssaiEntenduBis {
    public static void main(String[] arg) {
        JFrame fenetre = new JFrame();
        fenetre.setContentPane(new EntenduBis());

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setLocation(300, 300);
        fenetre.setVisible(true);
    }
}