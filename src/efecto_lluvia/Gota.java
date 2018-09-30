/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efecto_lluvia;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author david
 */
public class Gota {
    
    private int ancho,alto;
    private int posX;
    private double posY;
    private double aceleracion;
    
    
    public Gota(int ancho,int alto,int posX,int posY, double aceleracion){
        this.ancho=ancho;
        this.alto=alto;
        this.posX=posX;
        this.posY=posY;
        this.aceleracion=aceleracion;
                
    }
    
    public Rectangle2D getGota(){
        return new Rectangle2D.Double(posX,posY,ancho,alto);
    }
    
    public void mover(Rectangle limites){
        posY=posY + aceleracion;
       // aceleracion +=aceleracion;
        if (posY>limites.getMaxY()){
            posY=(-1)*(int)((Math.random()*50) +200);
            aceleracion=aleatorio(4,7);
        }
    }
    
     public int aleatorio(int ini,int fil){
        return  (int)((Math.random()*fil) +ini);
    }
   
    public int getPosX(){
        return posX;
    }
    public double getPosY(){
        return posY;
    }
    public double getAceleracion(){
        return aceleracion;
    }
    
   
    public void setPosX(int posX){
        this.posX=posX;
    }
    public void setPosY(int posY){
        this.posY=posY;
    }
    public void setAceleracion(double aceleracion){
        this.aceleracion=aceleracion;
    }
    
    
    
}
