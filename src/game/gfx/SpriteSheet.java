/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    
    private BufferedImage sheet;
    
    public SpriteSheet (BufferedImage sheet){
        this.sheet = sheet;
    }
    
    public BufferedImage crop(int width, int height, int x, int y){
        return sheet.getSubimage(x, y, width, height);
    }
}
