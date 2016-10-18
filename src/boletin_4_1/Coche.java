/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_4_1;

/**
 *
 * @author Portatil
 */
public class Coche {
    
    private int velocidade,frenar,acelerar;
    
    public Coche (){
        velocidade = 0;
        frenar = 0;
        acelerar = 0;
    }

public Coche (int vel, int fre, int acl){
    vel = velocidade;
    fre = frenar;
    acl = acelerar;
}
public int getVelocidade(){
    return acelerar - frenar;
}
    public void frenar(int fre){
        frenar = fre;
    }
    public void acelerar(int acl){
        acelerar = acl;
    }
}
