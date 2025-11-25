package br.univille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener, MouseMotionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        clicaAI();
    }

    private void clicaAI(){
        JOptionPane.showMessageDialog(null, "SERÁ?");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse X: " + e.getX() + " Y: " + e.getY());
    }
    
    
}
