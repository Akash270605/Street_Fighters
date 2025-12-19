/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.gfx;

import java.awt.image.BufferedImage;

public class Animation {
    
    public int rate, index;
    private long lastTime, timer;
    private BufferedImage[] frames;
    
    private boolean playedOnce = false;
    
    public Animation(int rate, BufferedImage[] frames){
        
        // inits class vars
        this.rate = rate;
        this.frames = frames;
        
        index = 0;
        // ms passed since start of program
        lastTime = System.currentTimeMillis();
    }
    
    public void tick(){
        
        // tick passed since current tick method and previously called tick method
        timer += System.currentTimeMillis() - lastTime;
        //reset 
        lastTime = System.currentTimeMillis();
        
        // if timer > rate per frames
        if(timer > rate){
            // increment index (i.e. go to next frame
            index ++;
            timer = 0;
            
            // if last frame, go to first frame
            if(index == frames.length){
                index = 0;
                // then the animation has played once
                playedOnce = true;
            }
        }
    }
    
    // gets index of frame of animation
    public int getFrame(){
        return index;
    }
    
    // gets image of current frame
    public BufferedImage getCurrentFrame(){
        return frames[index];
    }
    
    // ask if has beed played
    public boolean hasPlayedOnce(){
        return playedOnce;
    }
    
    // set played once to false
    public boolean setPlayed(){
        return playedOnce = false;
    }
}
