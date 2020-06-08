/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Pista;
import javax.swing.JLabel;

/**
 *
 * @author andre
 */
public class Carrera extends Thread{
    private JLabel c;
    private Pista p;

  public Carrera(){}

    public Carrera(JLabel c, Pista p) {
        this.c = c;
        this.p = p;
    }
    @Override
    public void run(){
    
    int c1=0, c2=0, c3=0,c4=0; 
    
        while (true) {            
            try{
            sleep((int) (Math.random() * 1000));
            c1 = p.getTormenta().getLocation().x;
            c2 = p.getRocinante().getLocation().x;
            c3 = p.getPalomo().getLocation().x;
            c4 = p.getTornado().getLocation().x;
            
            if(c1 < p.getmeta().getLocation().x-10 && c2 < p.getmeta().getLocation().x-10 && c3 < p.getmeta().getLocation().x-10 && c4 < p.getmeta().getLocation().x-10){
            c.setLocation(c.getLocation().x+10,c.getLocation().y);
            c.repaint();
            
            }
            else{
            break;
            }
            }
            catch(InterruptedException e){}
       if(c.getLocation().x>= p.getmeta().getLocation().x-10){
       
        if (c1 > c2 && c1 > c3 && c1 > c4) {
                   p.txtR.setText("El ganador es: " + "Tormenta");
                   
                } else if (c2 > c1 && c2 > c3 && c2 > c4) {
                   p.txtR.setText("El ganador es: " + "Rocinante");

                } else if (c3 > c1 && c3 > c3 && c3 > c4) {
                   p.txtR.setText("El ganador es: " + "Palomo");

                } else if (c4 > c1 && c4 > c2 && c4 > c3) {
                   p.txtR.setText("El ganador es: " + "Tornado");
                } else {
                    p.txtR.setText("Empate");
                }
       
       }
        
        }
    }
    public void reiniciar() {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        c1 = p.getTormenta().getLocation().x;
        c2 = p.getRocinante().getLocation().x;
        c3 = p.getPalomo().getLocation().x;
        c4 = p.getTornado().getLocation().x;
    }
    
}
