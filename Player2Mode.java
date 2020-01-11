import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2Mode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Mode extends Actor
{
    /**
     * Act - do whatever the Player2Mode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){ //if this actor is clicked, play button sound and set Players2 World
             Greenfoot.playSound("Button-SoundBible.com-1420500901.mp3");
             Greenfoot.setWorld(new Players2());
         }
    }    
}
