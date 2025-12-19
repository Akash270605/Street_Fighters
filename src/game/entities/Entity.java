/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.entities;

import java.awt.Graphics;

public abstract class Entity {
    protected float x, y;
    
    public Entity(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    //update
    public abstract void tick();
    
    //draw
    public abstract void render(Graphics g);
}
