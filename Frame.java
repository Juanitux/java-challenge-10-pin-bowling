/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingchallenge;

/**
 *
 * @author Juan Carlos Lopez
 */
public class Frame {
    private Tiro primerTiro;
    private Tiro segundoTiro;
    
    public Frame (Tiro primerTiro, Tiro segundoTiro){
        this.primerTiro = primerTiro;
        this.segundoTiro = segundoTiro;
    }
    
    public int numPinsBotados(){
        return primerTiro.numPinsBotados() + segundoTiro.numPinsBotados();
    }
    
    public boolean isStrike() {
        return false;
    }

    public boolean isSpare() {
        return false;
    }
}
