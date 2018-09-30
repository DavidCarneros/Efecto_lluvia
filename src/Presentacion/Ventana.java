package Presentacion;


import Presentacion.Lamina;
import efecto_lluvia.Hilo;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author david
 */
public class Ventana extends JFrame{
    
    private final int ANCHO=800,ALTO=500;
    private Lamina lm;
    private Hilo hilo;
    
    public Ventana(){
        setTitle("Efecto Lluvia");
        setSize(ANCHO,ALTO);
        setLocationRelativeTo(null);
        setResizable(false);
        lm = new Lamina();
        add(lm);
        hilo = new Hilo(lm);
        hilo.start();
        
        
    }
}
