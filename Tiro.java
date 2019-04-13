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
public class Tiro {
    private int numPinsBotados;
    
    public Tiro(int numPinsBotados){
        this.numPinsBotados = this.numPinsBotados;
    }
    
    public int numPinsBotados(){
        return numPinsBotados;
    }
    
    public static Tiro fallo(){
        return new Tiro(0);
    }

    
}
