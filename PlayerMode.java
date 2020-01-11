import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerMode extends Actor
{
    /**
     * Act - do whatever the PlayerMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){ //if this actor is clicked, play button sound and set Round1 World
             Greenfoot.playSound("Button-SoundBible.com-1420500901.mp3");
             Greenfoot.setWorld(new Round1());
         }
    }    
}
