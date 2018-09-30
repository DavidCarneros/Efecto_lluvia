package Presentacion;


import efecto_lluvia.Gota;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Lamina extends JPanel{
   
   // Gota gota=new Gota(6,30,0,0,0.05);
    Gota [] gotas;
    
    public Lamina(){
        setBackground(Color.BLACK);
        gotas=new Gota[400];
        for(int i=0;i<gotas.length;i++){
            gotas[i]=new Gota(2,15,aleatorio(0,800),(-1)*aleatorio(50,300),aleatorio(4,8));
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.MAGENTA);
        dibujar(g2);
        actualizar();
        
    }
    
    public void dibujar(Graphics2D g){
       for(int i=0;i<gotas.length;i++){
           g.fill(gotas[i].getGota());
       }
    }
    
    public void actualizar(){
        for(int i=0;i<gotas.length;i++){
        gotas[i].mover(getBounds());
        }
    }
    
    public int aleatorio(int ini,int fil){
        return  (int)((Math.random()*fil) +ini);
    }
   
        
    
}
