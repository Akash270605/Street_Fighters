/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.main.states;

import java.awt.Graphics;
import java.awt.Rectangle;

import game.main.Game;

public abstract class State {
    
    private static State currState = null;
    
    public static void setState(State state){
        currState = state;
    }
    
    // getter for state
    public static State getState(){
        return currState;
    }
    
    protected Game game;
    
    public State(Game game){
        this.game = game;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract void music();
    
    // hitbox methods
    public abstract Rectangle getRyuHitBounds();
    public abstract Rectangle getRyuAttackBounds();
    public abstract Rectangle getKenHitBounds();
    public abstract Rectangle getKenAttackBounds();
    public abstract int getRyuX();
    public abstract int getKenX();
}
