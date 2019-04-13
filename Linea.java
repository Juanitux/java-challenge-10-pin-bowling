/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingchallenge;


import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Juan Carlos Lopez
 */
public class Linea {
    public static int numTurnos = 10;
    
    private ArrayList<Frame> frames;
    
    public Linea (ArrayList<Frame> frames){
        this.frames = frames;
    }
    
    public Collection<Frame> frames() {
        return frames.subList(0, numTurnos);
    }

    public Frame next(Frame frame) {
        int numTurn = frames.indexOf(frame);
        return frames.get(numTurn + 1);
    }
            
}
